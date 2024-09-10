public interface Lockable   {

    void setKey(int key); /* To set the key */
    void lock(int key); /* To lock the object */
    void unlock(int key); /* To unloick the object */
    boolean locked(); /* To check if the the object is locked */

}
