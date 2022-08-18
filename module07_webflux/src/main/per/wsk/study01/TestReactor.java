package per.wsk.study01;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author wb_weishaokang
 * @date 2021/7/2 3:58 下午
 * @description
 */
public class TestReactor {


    public static void main(String[] args) {
        //just 方法直接声明
        Flux.just(1,2,3,4);
        Mono.just(1);

        //其他的方法
        Integer[] arr = {1,4,7,9};
        Flux.fromArray(arr).subscribe(System.out::print);

        System.out.println();
        Flux.just(1,2,3,7).subscribe(System.out::print);

        System.out.println();
        List<Integer> list = Arrays.asList(arr);
        Flux.fromIterable(list).subscribe(System.out::print);


        Stream<Integer> stream = list.stream();
        Flux.fromStream(stream);

    }



}
