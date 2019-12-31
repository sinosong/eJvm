package com.brilliance.ejvm;
import java.util.Date;

import com.brilliance.ejvm.entity.BaseModel;
import com.brilliance.ejvm.entity.Son;
import com.brilliance.ejvm.entity.SysUser;
import com.brilliance.ejvm.entity.TestClass;
import com.brilliance.ejvm.entity.TestInterface;
import com.brilliance.ejvm.exception.ByException;
import com.brilliance.ejvm.mapper.SysUserMapper;
import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author : hannasong
 * @version :
 * @date : Created in 4:55 下午 2019/10/17
 * @description :
 */
public class Test01 {

    @Test
    public void Test01(){
        System.out.println("begin...");
        tryThrow();
        System.out.println("end...");
    }


    public void tryThrow() {

        Exception le = null;
        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println(i);
                if(i==1){
                    int n = 1/0;
                    System.out.println("执行了...");
                }else if(i==2){
                    int n = 1/0;
                    System.out.println("执行成功了...");
                }else{
//                    int n = 1/0;
                    throw new ByException("111","111");
                }
                return;
            }catch (Throwable e) {
                le = new ByException("CODE",e.getMessage(), e);
                System.out.println(i+"??????????????");
//                le.printStackTrace();
            }
        }
//        throw new RuntimeException("运行时异常==",le);

        String emailContent = MoreObjects.toStringHelper(this)
                .add("Message",le.getMessage())
                .add("Cause", le.getCause())
                .add("password", 123)
                .add("userType", "001")
                .add("userName", "hns")
                .toString();
        System.out.println(emailContent);
    }

    @Test
    public void test01() {
        Set<String> keys = new HashSet();

        keys.add("a");
        keys.add("b");
        keys.add("c");
        keys.add("d");
        String[] strings = keys.toArray(new String[0]);
        String[] strings1 = keys.toArray(new String[0]);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(strings1));

    }

    @Test
    public void testGetName() {
        System.out.println(this.getClass().toString());
    }

    @Test
    public void testlambda() {

        List<SysUser> list = new ArrayList<SysUser>();
        SysUser u1 = new SysUser();
        u1.setId(1L);
        u1.setEnable(0);
        SysUser u2 = new SysUser();
        u2.setId(2L);
        u2.setEnable(0);
        SysUser u3 = new SysUser();
        u3.setId(3L);
        u3.setEnable(0);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        List<Long> longs = new ArrayList<Long>();
        longs.add(2L);
        longs.add(3L);

        List<Long> intersection = list.stream().map(SysUser::getId).filter(longs::contains).collect(Collectors.toList());
        List<Long> intersection2 = list.stream().map(BaseModel::getId).filter(longs::contains).collect(Collectors.toList());

        System.out.println(intersection);

        Map<Long,Integer> identityMap = new HashMap<>();

        intersection.parallelStream().forEach(customerId -> {
            try {
                Thread.sleep(100);
                identityMap.put(customerId,2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        for (SysUser sysUser : list) {
            if(intersection.contains(sysUser.getId())
                    && identityMap.get(sysUser.getId())!=2
            ){
                continue;
            }
            System.out.println(""+sysUser.getId());
        }


    }

    @Test
    public void testlambda2() {

        List<SysUser> list = new ArrayList<SysUser>();
        SysUser u1 = new SysUser();
        u1.setId(10L);
        u1.setEnable(10);
        SysUser u2 = new SysUser();
        u2.setId(10L);
        u2.setEnable(20);
        SysUser u3 = new SysUser();
        u3.setId(3L);
        u3.setEnable(30);
        list.add(u1);
        list.add(u2);
        list.add(u3);

//        Map<Long, Integer> collect = list.stream().collect(Collectors.toMap(SysUser::getId, SysUser::getEnable));
        Map<Long, Integer> collect = list.stream().collect(Collectors.toMap(SysUser::getId, SysUser::getEnable ,(int1, int2) -> int2));

        System.out.println(collect);
        //校验
        Predicate<SysUser> predicate = sysUser -> sysUser.getId()==10L;
//        for (SysUser sysUser : list) {
//            System.out.println(predicate.test(sysUser));
//        }

//        Function<SysUser,Long> function = sysUser -> sysUser.getId();
        //转换
        Function<SysUser,Long> function = SysUser::getId;
//        for (SysUser sysUser : list) {
//            System.out.println(function.apply(sysUser));
//        }

        //执行方法
        Consumer<SysUser> consumer = SysUser::print;
        Consumer<Long> consumerPrint = System.out::println;
//        for (SysUser sysUser : list) {
//            consumer.accept(sysUser);
//        }

        printNameWhenIDeq1(list,predicate,function,consumerPrint);

    }

    private <T, R> void printNameWhenIDeq1(Iterable<T> source, Predicate<T> predicate, Function<T, R> function,
                                           Consumer<R> consumer) {
        for (T t : source) {
            if (predicate.test(t)) {
                R r = function.apply(t);
                consumer.accept(r);
            }
        }
    }

    @Test
    public void SimpleTest() {

        TestInterface testInterface = Math::min;
//        TestInterface testInterface = (a, b) -> Math.min(a,b);
        SysUser sysUser = new SysUser();
        Consumer<SysUser> consumer1 = SysUser::print;
        Consumer<SysUser> consumer2 = SysUser::toString;

        TestClass testClass = new TestClass();
        TestInterface.TestInterfaceStatic();
        testClass.objMethod();

    }

    @Test
    public void testExtend() {

        Son son = new Son();
        son.setTamplateContext();


    }
}
