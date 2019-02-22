package com.design.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Person 类测试
 */
public class TestPerson {

    /**
     * 测试姓名异常
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNoName() throws Exception {
        new Person.Builder()
                .name(null)
                .age(17)
                .nationality(Nationality.JAPAN)
                .skinColor(SkinColor.YELLOW)
                .build();
    }

    /**
     * 测试创建 Person 对象
     */
    @Test
    public void testPersonBuild() throws Exception {

        String name = "老张";
        Integer age = 57;
        Person person = new Person.Builder()
                .name(name)
                .age(age)
                .nationality(Nationality.JAPAN)
                .skinColor(SkinColor.YELLOW)
                .build();

        assertNotNull(person);
        assertNotNull(person.toString());
        assertEquals(name, person.getName());
        assertEquals(age, person.getAge());
        assertEquals(Nationality.JAPAN, person.getNationality());
        assertEquals(SkinColor.YELLOW, person.getSkinColor());
    }
}
