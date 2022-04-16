/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 20:10:24 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      int int0 = (-283);
      aVLTree0.insert((-275));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(1);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete((-283));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete((-283));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node1);
      assertSame(aVLTree_Node1, aVLTree_Node0);
      
      aVLTree_Node0.right = aVLTree_Node1;
      assertEquals(1, aVLTree0.height());
      
      aVLTree_Node0.height = 0;
      assertEquals(0, aVLTree0.height());
      
      int int1 = aVLTree0.getBalance(aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
      assertFalse(int1 == int0);
      assertSame(aVLTree_Node0, aVLTree_Node1);
      assertEquals(1, int1);
      
      int int2 = 3002;
      aVLTree0.insert(int2);
      int int3 = 2424;
      aVLTree0.delete(int3);
      int int4 = (-230);
      aVLTree0.find(int4);
      aVLTree0.getRoot();
      aVLTree0.insert(int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.delete((-237));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete((-237));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.delete((-237));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(2656);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals(0, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      assertEquals(0, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(1, aVLTree0.height());
      assertEquals(1, int0);
      
      aVLTree0.delete((-3757));
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      int int0 = 876;
      int int1 = 3663;
      aVLTree0.insert(3663);
      assertEquals(0, aVLTree0.height());
      
      int int2 = (-1);
      aVLTree0.insert((-1));
      assertEquals(1, aVLTree0.height());
      
      // Undeclared exception!
      try { 
        aVLTree0.delete(3663);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      AVLTree aVLTree1 = new AVLTree();
      assertEquals((-1), aVLTree1.height());
      assertNotNull(aVLTree1);
      assertFalse(aVLTree1.equals((Object)aVLTree0));
      
      AVLTree.Node aVLTree_Node0 = aVLTree1.getRoot();
      assertEquals((-1), aVLTree1.height());
      assertNull(aVLTree_Node0);
      assertFalse(aVLTree1.equals((Object)aVLTree0));
      assertNotSame(aVLTree1, aVLTree0);
      
      int int0 = aVLTree0.getBalance((AVLTree.Node) null);
      assertEquals((-1), aVLTree0.height());
      assertFalse(aVLTree0.equals((Object)aVLTree1));
      assertNotSame(aVLTree0, aVLTree1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      int int0 = (-283);
      aVLTree0.insert((-275));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(1);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete((-283));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete((-283));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node1);
      assertSame(aVLTree_Node1, aVLTree_Node0);
      
      aVLTree_Node0.right = aVLTree_Node1;
      assertEquals(1, aVLTree0.height());
      
      aVLTree_Node0.height = 0;
      assertEquals(0, aVLTree0.height());
      
      int int1 = aVLTree0.getBalance(aVLTree_Node0);
      assertEquals(0, aVLTree0.height());
      assertFalse(int1 == int0);
      assertSame(aVLTree_Node0, aVLTree_Node1);
      assertEquals(1, int1);
      
      int int2 = 2424;
      // Undeclared exception!
      try { 
        aVLTree0.delete(int2);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert(832);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.delete((-36));
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      int int0 = aVLTree0.getBalance(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      assertEquals((-1), int0);
      
      int int1 = aVLTree0.getBalance(aVLTree_Node0);
      assertEquals(1, aVLTree0.height());
      assertTrue(int1 == int0);
      assertEquals((-1), int1);
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node1);
      assertSame(aVLTree_Node1, aVLTree_Node0);
      
      aVLTree_Node1.left = aVLTree_Node0;
      assertEquals(1, aVLTree0.height());
      
      aVLTree_Node1.height = (-1);
      assertEquals((-1), aVLTree0.height());
      
      int int2 = aVLTree0.getBalance(aVLTree_Node1);
      assertEquals((-1), aVLTree0.height());
      assertFalse(int2 == int1);
      assertFalse(int2 == int0);
      assertSame(aVLTree_Node1, aVLTree_Node0);
      assertEquals(0, int2);
      
      // Undeclared exception!
      aVLTree0.find((-1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert(266);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-8));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(104);
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(2, aVLTree0.height());
      
      // Undeclared exception!
      try { 
        aVLTree0.insert(104);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.insert(16);
      assertEquals(0, aVLTree0.height());
      
      int int0 = aVLTree0.height();
      assertEquals(0, aVLTree0.height());
      assertEquals(0, int0);
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(16);
      assertEquals(0, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.find(641);
      assertEquals(0, aVLTree0.height());
      assertNull(aVLTree_Node1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      assertEquals((-1), aVLTree0.height());
      assertNotNull(aVLTree0);
      
      aVLTree0.delete((-860));
      assertEquals((-1), aVLTree0.height());
      
      aVLTree0.insert(998);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete((-860));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete((-860));
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals(0, aVLTree0.height());
      
      aVLTree0.insert(0);
      assertEquals(1, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      assertEquals(1, aVLTree0.height());
      assertNotNull(aVLTree_Node0);
      
      aVLTree0.insert((-2430));
      assertEquals(1, aVLTree0.height());
      
      aVLTree0.insert((-3259));
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      assertEquals(2, aVLTree0.height());
      assertNotNull(aVLTree_Node1);
      assertFalse(aVLTree_Node1.equals((Object)aVLTree_Node0));
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
      
      AVLTree.Node aVLTree_Node2 = aVLTree0.find((-273));
      assertEquals(2, aVLTree0.height());
      assertNull(aVLTree_Node2);
      
      aVLTree0.insert((-273));
      assertEquals(2, aVLTree0.height());
      
      aVLTree0.delete(0);
      assertEquals(2, aVLTree0.height());
      
      AVLTree.Node aVLTree_Node3 = aVLTree0.find(0);
      assertEquals(2, aVLTree0.height());
      assertNull(aVLTree_Node3);
      
      int int0 = aVLTree0.getBalance((AVLTree.Node) null);
      assertEquals(2, aVLTree0.height());
      assertEquals(0, int0);
      
      AVLTree.Node aVLTree_Node4 = aVLTree0.getRoot();
      assertEquals(2, aVLTree0.height());
      assertNotNull(aVLTree_Node4);
      assertFalse(aVLTree_Node4.equals((Object)aVLTree_Node1));
      assertFalse(aVLTree_Node4.equals((Object)aVLTree_Node0));
      assertNotSame(aVLTree_Node4, aVLTree_Node1);
      assertNotSame(aVLTree_Node4, aVLTree_Node0);
      
      aVLTree0.insert((-860));
      assertEquals(2, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1654));
      aVLTree0.insert((-1654));
      aVLTree0.insert(2133);
      aVLTree0.insert((-3791));
      aVLTree0.delete(1171);
      aVLTree0.height();
      AVLTree aVLTree1 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree1.new Node(1);
      aVLTree0.delete(0);
      aVLTree1.insert(440);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree_Node0.key = 1901;
      aVLTree1.delete(218);
      aVLTree1.insert(218);
      aVLTree1.getBalance(aVLTree_Node0);
      aVLTree0.delete((-1265));
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree0.insert(0);
      aVLTree0.height();
      int int0 = aVLTree1.getBalance(aVLTree_Node1);
      assertEquals(2, aVLTree0.height());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete((-1626));
      aVLTree0.delete(67);
      aVLTree0.insert(0);
      aVLTree0.insert(1);
      aVLTree0.insert(835);
      aVLTree0.delete(835);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.right;
      aVLTree_Node0.right = null;
      aVLTree_Node0.key = (-2409);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.height();
      aVLTree0.height();
      aVLTree0.find(1);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = 0;
      aVLTree0.insert(0);
      int int1 = 1463;
      int int2 = 1864;
      aVLTree0.insert(1864);
      aVLTree0.insert(1463);
      aVLTree0.delete(1463);
      aVLTree0.delete((-1));
      // Undeclared exception!
      try { 
        aVLTree0.insert(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(328);
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.insert((-1493));
      aVLTree0.find((-1));
      aVLTree0.delete((-1));
      aVLTree0.insert((-1));
      // Undeclared exception!
      try { 
        aVLTree0.insert((-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.insert((-1889));
      aVLTree0.insert((-1));
      aVLTree0.delete((-1));
      aVLTree0.insert((-1));
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = aVLTree0.height();
      assertEquals((-1), int0);
  }
}
