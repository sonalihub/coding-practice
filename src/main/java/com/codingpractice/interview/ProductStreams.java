package com.codingpractice.interview;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductStreams {
    public static void main(String[] args) {
        List<Product> products=new ArrayList<>();
        products.add(new Product("apple", ProductType.APPLE, new BigDecimal(20.0)));
        products.add(new Product("pear", ProductType.PEAR, new BigDecimal(50.0)));
        products.stream().filter(p->p.getType().equals(ProductType.APPLE)).forEach(System.out::println);
     //   productList.forEach(System.out::println);
    }
}
