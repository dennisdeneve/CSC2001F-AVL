// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman
 
 /**
 * Prof Suleman's BTQueueNode code, used for purposes of assignment2
 *
 * @author Prof Suleman
 * @version 1.0
 * @since 26 March 2017
 */
public class BTQueueNode<dataType>
{
   BinaryTreeNode<dataType> node;
   BTQueueNode<dataType> next;
   
   /**
   * Method that assigns the parameters to the instance variables 
   *
   * @param instance of a BinaryTreeNode class of a certain dataType
   * @param instance of BTQueueNode class of a certain dataType 
   * @return nothing
   */
   
   public BTQueueNode ( BinaryTreeNode<dataType> n, BTQueueNode<dataType> nxt )
   {
      node = n;
      next = nxt;
   }
}
