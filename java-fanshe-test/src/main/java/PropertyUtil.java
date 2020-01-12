import java.lang.reflect.Field;

/**
 * @ProjectName: test
 * @ClassName: PropertyUtil
 * @Description: TODO(这是一个万能工具类  可以给实体类的参数赋值)
 * @Author: VTF
 * @create: 2020-01-12 10:03
 */
public class PropertyUtil {

    //person.setXxx()

    /**
     *
     * @param object  哪个对象
     * @param peopertyName  哪个属性
     * @param value        要赋什么值
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static void setProperty(Object object,String peopertyName,Object value) throws NoSuchFieldException, IllegalAccessException {

        //获取反射入口
        Class<?> aClass = object.getClass();
        Field declaredField = aClass.getDeclaredField(peopertyName);
        declaredField.setAccessible(true);
        declaredField.set(object,value);
    }
}
