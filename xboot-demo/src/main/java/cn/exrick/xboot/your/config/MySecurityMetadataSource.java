package cn.exrick.xboot.your.config;

import cn.hutool.core.util.StrUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

/**
 * 权限资源管理器
 * 为权限决断器提供支持
 *
 * @author Exrickx
 */
@Slf4j
@Component
public class MySecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
  private Map<String, Collection<ConfigAttribute>> map = null;

  /**
   * 加载权限表中所有操作请求权限
   */
  public void loadResourceDefine() {

    map = new HashMap<>(16);
    Collection<ConfigAttribute> configAttributes;
    ConfigAttribute cfg;
    // 获取启用的权限操作请求
    UserDetails currUser = new UserDetails() {
      @Override
      public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("admin"));
      }

      @Override
      public String getPassword() {
        return "123456";
      }

      @Override
      public String getUsername() {
        return null;
      }

      @Override
      public boolean isAccountNonExpired() {
        return false;
      }

      @Override
      public boolean isAccountNonLocked() {
        return false;
      }

      @Override
      public boolean isCredentialsNonExpired() {
        return false;
      }

      @Override
      public boolean isEnabled() {
        return false;
      }
    }; //当前登陆用户
    if (currUser == null) {
      return;
    }

    configAttributes = new ArrayList<>();
    cfg = new SecurityConfig("添加");
    //作为MyAccessDecisionManager类的decide的第三个参数
    configAttributes.add(cfg);
    //用权限的path作为map的key，用ConfigAttribute的集合作为value
    map.put("/add", configAttributes);
  }


  /**
   * 判定用户请求的url是否在权限表中
   * 如果在权限表中，则返回给decide方法，用来判定用户是否有此权限
   * 如果不在权限表中则放行
   *
   * @param o
   * @return
   * @throws IllegalArgumentException
   */
  @Override
  public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {

    if (map == null) {
      loadResourceDefine();
    }
    //Object中包含用户请求request
    String url = ((FilterInvocation) o).getRequestUrl();
    PathMatcher pathMatcher = new AntPathMatcher();
    Iterator<String> iterator = map.keySet().iterator();
    while (iterator.hasNext()) {
      String resURL = iterator.next();
      if (StrUtil.isNotBlank(resURL) && pathMatcher.match(resURL, url)) {
        return map.get(resURL);
      }
    }
    return null;
  }

  @Override
  public Collection<ConfigAttribute> getAllConfigAttributes() {
    return null;
  }

  @Override
  public boolean supports(Class<?> aClass) {
    return true;
  }
}
