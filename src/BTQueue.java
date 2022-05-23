// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

/**
* Prof Suleman's BTQueue code, used for purposes of assignment2
*
* @author Prof Suleman
* @version 1.0
* @since 26 March 2017
*/

public class BTQueue<dataType>
{   
   BTQueueNode<dataType> head;
   BTQueueNode<dataType> tail;
      
   public BTQueue ()
   {
      head = null;
      tail = null;
   }
   
   /**
   * Method that gets the next node
   *
   * @param none
   * @return the next node
   */
   public BinaryTreeNode<dataType> getNext ()
   {
      if (head == null)
         return null;
      BTQueueNode<dataType> qnode = head;
      head = head.next;
      if ( head == null )
         tail = null;
      return qnode.node;
   }
   /**
   * Method to see if its the end of the queue
   *
   * @param a node of a certain dataType, from BinaryTreeNode class
   * @return nothing, just reassigns values
   */
   public void enQueue ( BinaryTreeNode<dataType> node )
   {
      if (tail == null)
      {   
         tail = new BTQueueNode<dataType> (node, null);
         head = tail;
      }   
      else
      {
         tail.next = new BTQueueNode<dataType> (node, null);
         tail = tail.next;
      }   
   }   
}
