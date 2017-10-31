package org.apache.zookeeper.server;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Set;

import org.junit.Test;

public class NullTest {

    @Test
    public void testGetChildren() {
        DataNode dataNode = new DataNode();
        System.out.println("Test Null Started");
        Set<String> children = dataNode.getChildren();
        assertNotNull(children);
        assertEquals(0, children.size());

        String child = "child";
        dataNode.addChild(child);
        dataNode.removeChild(child);
        children = dataNode.getChildren();
        assertNotNull(children);
        assertEquals(0, children.size());
        System.out.println("Test Successful");
    }

}