package com.lind.xbootdemo.xbootgenerate;

import com.lind.xbootdemo.xbootgenerate.bean.Entity;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.FileResourceLoader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static com.lind.xbootdemo.xbootgenerate.XbootGenerator.*;

/**
 * 代码生成器 Mybatis-Plus
 *
 * @author Exrickx
 */
public class XbootMultiGenerator {
    public XbootMultiGenerator(String className, String module, String packageName) {
        this.className = className;
        this.module = module;
        this.packageName = packageName;
    }

    /**
     * 作者名
     */
    private static final String author = "lind";
    /**
     * 实体类名
     * 建议仅需修改
     */
    private String className;
    /**
     * 类说明描述
     * 建议仅需修改
     */
    private String description;
    /**
     * 数据库表名前缀
     * 下方请根据需要修改
     */
    private String tablePre = "t_";
    /**
     * 主键类型
     */
    private String primaryKeyType = "String";
    /**
     * 生成模块路径
     * (文件自动生成至该模块下)
     */
    private String module;
    /**
     * 生成包的名称
     */
    private String packageName;
    /**
     * 实体类对应包
     * (文件自动生成至该包下)
     */
    private String entityPackage = packageName + ".entity";
    /**
     * dao对应包 【注意修改后需到cn.exrick.xboot.core.config.mybatisplus.MybatisPlusConfig配置你的mapper路径扫描】
     * (文件自动生成至该包下)
     */
    private String daoPackage = packageName + ".mapper";
    /**
     * service对应包
     * (文件自动生成至该包下)
     */
    private String servicePackage = packageName + ".service";
    /**
     * serviceImpl对应包
     * (文件自动生成至该包下)
     */
    private String serviceImplPackage = packageName + ".serviceimpl";
    /**
     * controller对应包
     * (文件自动生成至该包下)
     */
    private String controllerPackage = packageName + ".controller";
    /**
     * 生成器模板地址.
     */
    private String templateRoot = System.getProperty("user.dir") + "/xboot-generate/src/main/java/com/lind/xbootdemo/xbootgenerate/template";

    /**
     * 生成代码.
     *
     * @throws IOException
     */
    public void generate() throws IOException {
        FileResourceLoader resourceLoader = new FileResourceLoader(templateRoot, "utf-8");
        Configuration cfg = Configuration.defaultConfiguration();
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);

        // 生成代码
        generateCode(gt);

        // 根据类名删除生成的代码
        // deleteCode(className);
    }

    /**
     * 生成代码
     *
     * @param gt
     * @throws IOException
     */
    private void generateCode(GroupTemplate gt) throws IOException {

        Template entityTemplate = gt.getTemplate("entity.btl");
        Template daoTemplate = gt.getTemplate("mapper.btl");
        Template serviceTemplate = gt.getTemplate("mpService.btl");
        Template serviceImplTemplate = gt.getTemplate("mpServiceImpl.btl");
        Template controllerTemplate = gt.getTemplate("mpController.btl");
        Template mapperXmlTemplate = gt.getTemplate("mapperXml.btl");

        Entity entity = new Entity();
        entity.setEntityPackage(entityPackage);
        entity.setDaoPackage(daoPackage);
        entity.setServicePackage(servicePackage);
        entity.setServiceImplPackage(serviceImplPackage);
        entity.setControllerPackage(controllerPackage);
        entity.setAuthor(author);
        entity.setClassName(className);
        entity.setTableName(tablePre + camel2Underline(className));
        entity.setClassNameLowerCase(first2LowerCase(className));
        entity.setDescription(description);
        entity.setPrimaryKeyType(primaryKeyType);
        entity.setIsTree(false);

        OutputStream out = null;

        //生成实体类代码
        entityTemplate.binding("entity", entity);
        String entityResult = entityTemplate.render();
        System.out.print(entityResult);
        //创建文件
        String entityFileUrl = System.getProperty("user.dir") + module + "/src/main/java/" + dotToLine(entityPackage) + "/" + className + ".java";
        File entityFile = new File(entityFileUrl);
        File entityDir = entityFile.getParentFile();
        if (!entityDir.exists()) {
            entityDir.mkdirs();
        }
        if (!entityFile.exists()) {
            // 若文件存在则不重新生成
            entityFile.createNewFile();
            out = new FileOutputStream(entityFile);
            entityTemplate.renderTo(out);
        }

        //生成dao代码
        daoTemplate.binding("entity", entity);
        String daoResult = daoTemplate.render();
        System.out.print(daoResult);
        //创建文件
        String daoFileUrl = System.getProperty("user.dir") + module + "/src/main/java/" + dotToLine(daoPackage) + "/" + className + "Mapper.java";
        File daoFile = new File(daoFileUrl);
        File daoDir = daoFile.getParentFile();
        if (!daoDir.exists()) {
            daoDir.mkdirs();
        }
        if (!daoFile.exists()) {
            // 若文件存在则不重新生成
            daoFile.createNewFile();
            out = new FileOutputStream(daoFile);
            daoTemplate.renderTo(out);
        }

        //生成service代码
        serviceTemplate.binding("entity", entity);
        String serviceResult = serviceTemplate.render();
        System.out.print(serviceResult);
        //创建文件
        String serviceFileUrl = System.getProperty("user.dir") + module + "/src/main/java/" + dotToLine(servicePackage) + "/I" + className + "Service.java";
        File serviceFile = new File(serviceFileUrl);
        File serviceDir = serviceFile.getParentFile();
        if (!serviceDir.exists()) {
            serviceDir.mkdirs();
        }
        if (!serviceFile.exists()) {
            // 若文件存在则不重新生成
            serviceFile.createNewFile();
            out = new FileOutputStream(serviceFile);
            serviceTemplate.renderTo(out);
        }

        //生成serviceImpl代码
        serviceImplTemplate.binding("entity", entity);
        String serviceImplResult = serviceImplTemplate.render();
        System.out.print(serviceImplResult);
        //创建文件
        String serviceImplFileUrl = System.getProperty("user.dir") + module + "/src/main/java/" + dotToLine(serviceImplPackage) + "/I" + className + "ServiceImpl.java";
        File serviceImplFile = new File(serviceImplFileUrl);
        File serviceImplDir = serviceImplFile.getParentFile();
        if (!serviceImplDir.exists()) {
            serviceImplDir.mkdirs();
        }
        if (!serviceImplFile.exists()) {
            // 若文件存在则不重新生成
            serviceImplFile.createNewFile();
            out = new FileOutputStream(serviceImplFile);
            serviceImplTemplate.renderTo(out);
        }

        //生成controller代码
        controllerTemplate.binding("entity", entity);
        String controllerResult = controllerTemplate.render();
        System.out.print(controllerResult);
        //创建文件
        String controllerFileUrl = System.getProperty("user.dir") + module + "/src/main/java/" + dotToLine(controllerPackage) + "/" + className + "Controller.java";
        File controllerFile = new File(controllerFileUrl);
        File controllerDir = controllerFile.getParentFile();
        if (!controllerDir.exists()) {
            controllerDir.mkdirs();
        }
        if (!controllerFile.exists()) {
            // 若文件存在则不重新生成
            controllerFile.createNewFile();
            out = new FileOutputStream(controllerFile);
            controllerTemplate.renderTo(out);
        }

        //生成mapperXml代码
        mapperXmlTemplate.binding("entity", entity);
        String mapperXmlResult = mapperXmlTemplate.render();
        System.out.print(mapperXmlResult);
        //创建文件
        String mapperXmlFileUrl = System.getProperty("user.dir") + module + "/src/main/resources/mapper/" + className + "Mapper.xml";
        File mapperXmlFile = new File(mapperXmlFileUrl);
        File mapperXmlDir = mapperXmlFile.getParentFile();
        if (!mapperXmlDir.exists()) {
            mapperXmlDir.mkdirs();
        }
        if (!mapperXmlFile.exists()) {
            // 若文件存在则不重新生成
            mapperXmlFile.createNewFile();
            out = new FileOutputStream(mapperXmlFile);
            mapperXmlTemplate.renderTo(out);
        }

        if (out != null) {
            out.close();
        }
        System.out.print("生成代码成功！");
    }

    /**
     * 删除指定类代码
     *
     * @param className
     * @throws IOException
     */
    private void deleteCode(String className) throws IOException {

        String entityFileUrl = System.getProperty("user.dir") + module + "/src/main/java/" + dotToLine(entityPackage) + "/" + className + ".java";
        File entityFile = new File(entityFileUrl);
        if (entityFile.exists()) {
            entityFile.delete();
        }
        String daoFileUrl = System.getProperty("user.dir") + module + "/src/main/java/" + dotToLine(daoPackage) + "/" + className + "Mapper.java";
        File daoFile = new File(daoFileUrl);
        if (daoFile.exists()) {
            daoFile.delete();
        }

        String serviceFileUrl = System.getProperty("user.dir") + module + "/src/main/java/" + dotToLine(servicePackage) + "/I" + className + "Service.java";
        File serviceFile = new File(serviceFileUrl);
        if (serviceFile.exists()) {
            serviceFile.delete();
        }

        String serviceImplFileUrl = System.getProperty("user.dir") + module + "/src/main/java/" + dotToLine(serviceImplPackage) + "/I" + className + "ServiceImpl.java";
        File serviceImplFile = new File(serviceImplFileUrl);
        if (serviceImplFile.exists()) {
            serviceImplFile.delete();
        }

        String controllerFileUrl = System.getProperty("user.dir") + module + "/src/main/java/" + dotToLine(controllerPackage) + "/" + className + "Controller.java";
        File controllerFile = new File(controllerFileUrl);
        if (controllerFile.exists()) {
            controllerFile.delete();
        }

        String mapperXmlFileUrl = System.getProperty("user.dir") + module + "/src/main/resources/mapper/" + className + "Mapper.xml";
        File mapperXmlFile = new File(mapperXmlFileUrl);
        if (mapperXmlFile.exists()) {
            mapperXmlFile.delete();
        }

        System.out.print("删除代码完毕！");
    }
}
