package mission.Week3_Day1.Problem_2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class SingletonContext {
    private static SingletonConfig config;
    private static Map<String, Method> singletonMap = new HashMap<>();
    private static Map<String, Object> singletonObjectMap = new HashMap<>();

    public static void setConfig(SingletonConfig config) {
        SingletonContext.config = config;
    }

    static synchronized Object getSingleton(String name) throws InvocationTargetException, IllegalAccessException {
        //TODO: 아래 구문 삭제 후, Map을 이용한 Singleton 생성 로직 구현 필요합니다.
        //singletonObject를 Object 객체로 선언하고 이름을 가져옴
        Object singletonObject = singletonObjectMap.get(name);
        //만약 가져온 이름이 null값이라면 생성하기 전이기 떄문에 실행
        if(singletonObject == null){
            //singletonObject는 singletonMap에서 이름과 annotation으로 정의된 함수를 가져옴
            singletonObject = singletonMap.get(name).invoke(config);
            singletonObjectMap.put(name, singletonObject);
        }
        return singletonObject;
    }
    public static void executeMethodsBySingletonAnnotation(Object object) {
        // TODO - 1: Object 가 들어 오면 해당 클래스의 Method를 돌면서, @Singleton annotation을 발견합니다.
        // TODO - 2: 해당 Annotation의 name 과 method를 적당한 Map에 저장합니다.
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for(Method method: methods){
            Annotation[] annotations = method.getDeclaredAnnotations();

            for(Annotation annotation: annotations){
                if(annotation instanceof Singleton){
                    Singleton singletonAnnotation = (Singleton) annotation;
                    String name = singletonAnnotation.name();
                    singletonMap.put(name, method);
                }
            }
        }
    }
}
