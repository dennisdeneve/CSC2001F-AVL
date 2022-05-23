// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

/**
* Prof Suleman's BinaryTreeNode code, used for purposes of assignment2
*
* @author Prof Suleman
* @version 1.0
* @since 26 March 2017
*/
public class BinaryTreeNode<dataType>
{
   dataType data;
   BinaryTreeNode<dataType> left;
   BinaryTreeNode<dataType> right;
   int height;

   public BinaryTreeNode ( dataType d, BinaryTreeNode<dataType> l, BinaryTreeNode<dataType> r )
   {
      data = d;
      left = l;
      right = r;
      height = 0;
   }
   /**
   * Accessor method that gets the left node
   *
   * @param none
   * @return the left node
   */
   BinaryTreeNode<dataType> getLeft () { 
   return left; 
   }
   /**
   * Accessor method that gets the right node
   *
   * @param none
   * @return the right node
   */
   BinaryTreeNode<dataType> getRight () { 
   return right; 
   }
}
