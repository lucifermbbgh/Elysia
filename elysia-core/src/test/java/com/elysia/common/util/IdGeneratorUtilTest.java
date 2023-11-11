package com.elysia.common.util;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class IdGeneratorUtilTest extends TestCase {
    public void test_getId() {
        String id = IdGeneratorUtil.getId();
        System.out.println(id);
    }
}