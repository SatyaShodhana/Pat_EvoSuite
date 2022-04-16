/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 16 18:43:52 GMT 2022
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(1);
      aVLTree0.delete((-1));
      aVLTree0.insert((-1));
      aVLTree0.delete((-1));
      aVLTree0.delete(1);
      aVLTree0.insert((-1));
      aVLTree0.insert((-1318));
      aVLTree0.insert(1);
      aVLTree0.delete(364);
      aVLTree0.insert(0);
      aVLTree0.delete(364);
      aVLTree0.delete((-1));
      aVLTree0.insert((-179));
      aVLTree0.insert((-1));
      aVLTree0.find(0);
      aVLTree0.getRoot();
      aVLTree0.find(0);
      aVLTree0.delete(0);
      aVLTree0.find((-976));
      aVLTree0.find(2892);
      aVLTree0.find((-35));
      aVLTree0.insert(0);
      aVLTree0.find(0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(2093);
      aVLTree0.insert((-638));
      aVLTree0.insert((-1));
      aVLTree0.insert((-1480));
      aVLTree0.insert(713);
      aVLTree0.insert((-3431));
      aVLTree0.insert((-3432));
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      aVLTree_Node0.height = (-144);
      aVLTree_Node0.key = (-144);
      aVLTree0.delete((-3431));
      aVLTree0.insert(1);
      aVLTree0.height();
      aVLTree0.delete(0);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree_Node0.key = (-1472);
      aVLTree0.insert((-3431));
      aVLTree0.delete(1);
      aVLTree0.height();
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.left;
      aVLTree0.getBalance(aVLTree_Node1);
      aVLTree0.getRoot();
      aVLTree0.getBalance(aVLTree_Node1);
      aVLTree0.find((-633));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(1);
      aVLTree0.delete((-1));
      aVLTree0.insert((-1));
      aVLTree0.delete((-1));
      aVLTree0.delete(1);
      aVLTree0.insert((-1));
      aVLTree0.insert((-1318));
      aVLTree0.insert(1);
      aVLTree0.delete(364);
      aVLTree0.insert(0);
      aVLTree0.delete(364);
      aVLTree0.delete((-1));
      aVLTree0.insert((-179));
      aVLTree0.insert((-1));
      aVLTree0.find(0);
      aVLTree0.getRoot();
      aVLTree0.find(0);
      aVLTree0.find((-976));
      aVLTree0.find(2892);
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
  public void test03()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      aVLTree0.insert((-273));
      aVLTree0.delete(0);
      aVLTree0.insert((-1108));
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      aVLTree0.delete((-1108));
      AVLTree.Node aVLTree_Node1 = aVLTree0.new Node(0);
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node0.key = (-6);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.height();
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.height();
      aVLTree0.delete(0);
      aVLTree0.insert(125);
      aVLTree0.delete(0);
      aVLTree0.height();
      aVLTree0.delete((-6));
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      aVLTree0.getBalance(aVLTree_Node2);
      aVLTree0.insert(930);
      aVLTree0.getBalance(aVLTree_Node1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.delete(0);
      aVLTree0.insert((-273));
      aVLTree0.delete(0);
      aVLTree0.insert((-1108));
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(0);
      aVLTree0.delete((-1108));
      AVLTree.Node aVLTree_Node1 = aVLTree0.new Node(0);
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node0.key = (-6);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.height();
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.insert(0);
      aVLTree0.height();
      aVLTree0.delete(0);
      aVLTree0.insert(125);
      aVLTree0.insert(2054);
      aVLTree0.delete(0);
      aVLTree0.height();
      aVLTree0.delete((-6));
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      aVLTree0.getBalance(aVLTree_Node2);
      aVLTree0.insert(930);
      aVLTree0.getBalance(aVLTree_Node1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree_Node0.key = 168;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.find(0);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node1.key = (-1);
      aVLTree_Node1.key = 168;
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree_Node1.key = 168;
      aVLTree0.getBalance(aVLTree_Node1);
      int int0 = 2958;
      // Undeclared exception!
      try { 
        aVLTree0.delete(int0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-2737));
      AVLTree.Node aVLTree_Node0 = aVLTree0.find((-2737));
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node0.height = (-2737);
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree_Node0.height = (-2737);
      int int0 = aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.height();
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree0.height();
      aVLTree_Node0.key = (-2736);
      int int1 = (-24);
      aVLTree0.insert(int1);
      aVLTree0.insert(aVLTree_Node0.height);
      int int2 = 0;
      aVLTree0.insert(int2);
      int int3 = 3183;
      int int4 = 0;
      aVLTree0.delete(int4);
      aVLTree0.find(int3);
      aVLTree0.insert(int0);
      aVLTree0.getRoot();
      int int5 = 2333;
      aVLTree0.insert(int5);
      aVLTree0.getRoot();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.find(1);
      aVLTree0.delete((-3875));
      aVLTree0.insert(1);
      aVLTree0.delete(0);
      aVLTree0.delete((-851));
      aVLTree0.insert(711);
      aVLTree0.height();
      aVLTree0.getRoot();
      aVLTree0.delete(1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
      aVLTree_Node0.height = 0;
      aVLTree_Node0.height = 0;
      AVLTree.Node aVLTree_Node1 = aVLTree0.new Node(0);
      aVLTree_Node0.right = aVLTree_Node1;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree_Node1.left = aVLTree_Node0.right;
      aVLTree_Node0.key = 0;
      aVLTree_Node1.key = 2377;
      aVLTree0.getBalance(aVLTree_Node0);
      // Undeclared exception!
      aVLTree0.delete(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree_Node1.left = aVLTree_Node0;
      aVLTree_Node1.height = 0;
      aVLTree_Node0.left = aVLTree_Node1.left;
      AVLTree.Node aVLTree_Node2 = aVLTree0.getRoot();
      aVLTree_Node1.left.left = aVLTree_Node2;
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree_Node1.right.left = aVLTree_Node1.left;
      aVLTree_Node0.left.right = aVLTree_Node1;
      aVLTree_Node0.right = aVLTree_Node1.right;
      aVLTree_Node0.right = aVLTree_Node1.right;
      aVLTree_Node1.right.left = aVLTree_Node0.right;
      aVLTree_Node1.right.left = aVLTree_Node1.left;
      aVLTree_Node1.left.height = (-1848);
      aVLTree_Node1.right = aVLTree_Node0;
      aVLTree_Node0.left = aVLTree_Node1;
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.find(0);
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      // Undeclared exception!
      aVLTree0.delete(0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.height();
      aVLTree0.insert((-1));
      aVLTree0.find(793);
      aVLTree0.height();
      aVLTree0.getRoot();
      aVLTree0.insert(0);
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
  public void test11()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.find(2190);
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.find(1);
      aVLTree0.insert(2190);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(896);
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.delete(0);
      aVLTree0.find((-2038));
      aVLTree0.insert((-2038));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.find(0);
      aVLTree0.getBalance((AVLTree.Node) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.delete(0);
      aVLTree0.delete(2175);
      aVLTree0.getRoot();
      aVLTree0.delete(0);
      aVLTree0.delete(646);
      aVLTree0.insert(0);
      aVLTree0.delete(1394);
      aVLTree0.find(0);
      aVLTree0.height();
      aVLTree0.getRoot();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-1988));
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.find(1089);
      aVLTree0.insert((-2033));
      aVLTree0.insert(1);
      aVLTree0.find(1089);
      aVLTree0.delete(578);
      aVLTree0.insert(0);
      aVLTree0.delete(1873);
      aVLTree0.height();
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1);
      aVLTree0.delete(1);
      aVLTree0.getBalance(aVLTree_Node0);
      aVLTree0.getRoot();
      aVLTree0.getRoot();
      aVLTree0.delete((-2963));
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
  public void test17()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.insert(1);
      aVLTree0.delete((-1));
      aVLTree0.insert((-1));
      aVLTree0.insert(545);
      aVLTree0.delete((-1));
      aVLTree0.delete(255);
      aVLTree0.delete((-1));
      aVLTree0.getRoot();
      aVLTree0.find((-1));
      aVLTree0.find(0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(3744);
      aVLTree0.delete((-1));
      aVLTree0.insert((-4052));
      // Undeclared exception!
      try { 
        aVLTree0.insert((-4052));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      int int0 = (-1);
      aVLTree0.insert(2202);
      aVLTree0.insert((-1));
      // Undeclared exception!
      try { 
        aVLTree0.delete(2202);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("AVLTree", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1322);
      aVLTree0.insert(0);
      aVLTree0.insert(463);
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node(1322);
      aVLTree0.delete(1322);
      aVLTree_Node0.key = 1322;
      aVLTree0.insert((-502));
      aVLTree0.getBalance(aVLTree_Node0);
      AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
      aVLTree0.delete(0);
      aVLTree0.getBalance(aVLTree_Node1);
      aVLTree0.find((-1));
      aVLTree0.delete(2264);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1375);
      aVLTree0.delete(1375);
      aVLTree0.delete(0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.insert((-3897));
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
  public void test23()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(2962);
      aVLTree0.getRoot();
      aVLTree0.delete(0);
      aVLTree0.height();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
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
  public void test25()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(0);
      aVLTree0.delete(234);
      aVLTree0.find(0);
      aVLTree0.getRoot();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(1);
      aVLTree0.find((-360));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.find(2288);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((-248));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert((-627));
      aVLTree0.insert((-1));
      aVLTree0.insert(713);
      aVLTree0.insert((-3441));
      aVLTree0.insert((-3432));
      aVLTree0.insert(0);
      AVLTree.Node aVLTree_Node0 = aVLTree0.find(0);
      aVLTree_Node0.key = (-144);
      aVLTree0.height();
      aVLTree_Node0.key = 2;
      aVLTree0.delete(2);
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.left;
      aVLTree0.getBalance((AVLTree.Node) null);
      aVLTree0.getRoot();
      assertEquals(2, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.height();
      aVLTree0.insert((-40));
      aVLTree0.insert(1570);
      aVLTree0.insert((-1));
      assertEquals(1, aVLTree0.height());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AVLTree aVLTree0 = new AVLTree();
      aVLTree0.insert(2087);
      aVLTree0.delete((-1));
      aVLTree0.insert((-1));
      aVLTree0.insert((-1318));
      aVLTree0.insert(0);
      aVLTree0.delete((-1));
      aVLTree0.find((-1));
      // Undeclared exception!
      try { 
        aVLTree0.insert(2087);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // duplicate Key!
         //
         verifyException("AVLTree", e);
      }
  }
}
