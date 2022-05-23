# AVL program makefile
# Dennis
# 08 April 


JAVAC=/usr/bin/javac
.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin

#.java.class:
#	$(JAVAC) $<

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<

CLASSES = BinaryTreeNode.class BTQueueNode.class BTQueue.class BinaryTree.class AVLTree.class StudentTxt.class AccessAVLApp.class
CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

clean: 
	rm $(BINDIR)/*.class

runavl : $(CLASS_FILES)
	java -cp $(BINDIR) AccessAVLApp
	
