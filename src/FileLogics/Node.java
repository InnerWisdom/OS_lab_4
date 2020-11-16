package FileLogics;

import java.util.ArrayList;

public class Node {
    public int nodeSize;
    public ArrayList<File> fileList;
    private int nodeIndex;
    private int fileIndex;
    private File file;

    public Node(File file, int nodeIndex, int fileIndex) {
        nodeSize = 5;
        this.fileIndex = fileIndex;
        this.file = file;
        this.nodeIndex = nodeIndex;
    }

    public int getNodeSize() {
        return nodeSize;
    }

    public void setNodeSize(int nodeSize) {
        this.nodeSize = nodeSize;
    }

    public int getNodeIndex() {
        return nodeIndex;
    }

    public void setNodeIndex(int nodeIndex) {
        this.nodeIndex = nodeIndex;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public ArrayList<File> sortByNode(int nodeIndex) {
        if (getNodeIndex() == nodeIndex) {
            for (int i = fileIndex; i < nodeSize; i++) {
                fileList.add(getFile());
            }
        }
        return fileList;
    }
}
