package tesseract.OTserver.objects;

import java.util.*;

/**
 * Class that defines a code file document
 */
public class Document {

    /**
     * The string model of the document. The text of the code file
     */
    private String model;

    /**
     * The revision Id of the document. Each committed string change request increments this value.
     * This is used to flag historical requests as irrelevant
     */
    private Integer revID;

    /**
     * The map of revID to list of string change requests. Keeps the history of all committed changes.
     */
    private HashMap<Integer, ArrayList<StringChangeRequest>> changeHistory;

    /**
     * The queue of pending string change requests.
     */
    private Queue<StringChangeRequest> pendingChangesQueue;

    private boolean hasChanged;

    private Long id;

    public Document(Long id) {
        this.id = id;
        this.model = "";
        this.revID = 1;
        this.changeHistory = new HashMap<>();
        this.pendingChangesQueue = new LinkedList<>();
        this.hasChanged = false;
    }

    public Document(Long id, String model) {
        this.id = id;
        this.model = model;
        this.revID = 1;
        this.changeHistory = new HashMap<>();
        this.pendingChangesQueue = new LinkedList<>();
        this.hasChanged = false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRevID() {
        return revID;
    }

    public void setRevID(Integer revID) {
        this.revID = revID;
    }

    public HashMap<Integer, ArrayList<StringChangeRequest>> getChangeHistory() {
        return changeHistory;
    }

    public void setChangeHistory(HashMap<Integer, ArrayList<StringChangeRequest>> changeHistory) {
        this.changeHistory = changeHistory;
    }

    public Queue<StringChangeRequest> getPendingChangesQueue() {
        return pendingChangesQueue;
    }

    public void setPendingChangesQueue(PriorityQueue<StringChangeRequest> pendingChangesQueue) {
        this.pendingChangesQueue = pendingChangesQueue;
    }

    public Long getId() {
        return id;
    }

    public boolean isHasChanged() {
        return hasChanged;
    }

    public void setHasChanged(boolean hasChanged) {
        this.hasChanged = hasChanged;
    }
}
