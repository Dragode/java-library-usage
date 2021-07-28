package person.dragon.beancopy;

import org.apache.commons.beanutils.BeanUtils;
import org.openjdk.jmh.annotations.Benchmark;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * We often need to copy properties between two POJO,eg: copy entity to DTO.
 * We also add a JMH bench mark to see the performance between each library.
 * You use [todo add command] to run the benchmark.
 * The result running at my computer like this:
 * todo add result
 *
 * @author Dragon
 */
public class BeanCopyUsage {

    private static SourceBean sourceBean;

    //Init the source bean.
    static {
        sourceBean = new SourceBean();
        sourceBean.setId("1");
        sourceBean.setCount(2);
        sourceBean.setDate(new Date());
        SourceInnerClass sourceInnerClass = new SourceInnerClass();
        sourceInnerClass.setTitle("title");
        sourceBean.setInnerClass(sourceInnerClass);
    }

    /**
     * [ Recommend ] mapstruct library will generate todo desc
     */
    @Benchmark
    public void mapStruct() {
        //First add a mapper like MapstructMapper
        //Then use MapstructMapper to copy bean properties
        DestinationBean copiedBean = MapstructMapper.INSTANCE.copy(sourceBean);
    }

    /**
     * todo short description
     */
    @Benchmark
    public void springBeanCopy() {
        //todo implements
    }

    /**
     * [ Caution! ] Dont use apache BeanUtils to copy properties between bean.
     * todo add reason
     */
    @Benchmark
    public void apacheBeanCopy() {
        DestinationBean destinationBean = new DestinationBean();
        try {
            BeanUtils.copyProperties(destinationBean, sourceBean);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
