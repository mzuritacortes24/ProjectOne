public class Coin implements Lockable{

    private final int HEADS = 1;
    private final int TAILS = 0;
    private int face;
    private int key;
    private boolean isLocked;

    //----------------------------------------------------------------
    // Sets up the coin by flipping it initially.
    //----------------------------------------------------------------
    public Coin() {
        flip();
        isLocked = false; // Initially, the coin is unlocked
    }

    //----------------------------------------------------------------
    // Flips the coin by randomly choosing a face value.
    //----------------------------------------------------------------
    public void flip() {
        if (!isLocked) {
            face = (int) (Math.random() * 2);
        } else {
            System.out.println("Coin is locked! Cannot flip.");
        }
    }

    //----------------------------------------------------------------
    // Returns true if the current face of the coin is heads.
    //----------------------------------------------------------------
    public boolean isHeads() {
        if (!isLocked) {
            return (face == HEADS);
        } else {
            System.out.println("Coin is locked! Cannot check face.");
            return false;
        }
    }

    //----------------------------------------------------------------
    // Returns the current face of the coin as a string.
    //----------------------------------------------------------------
    public String toString() {
        if (!isLocked) {
            if (face == HEADS) {
                return "Heads";
            } else {
                return "Tails";
            }
        } else {
            return "Coin is locked! Cannot display face.";
        }
    }

    //----------------------------------------------------------------
    // Lockable interface methods
    //----------------------------------------------------------------

    @Override
    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public void lock(int key) {
        if (this.key == key) {
            isLocked = true;
        } 
        else {
            System.out.println("Incorrect key! Cannot lock.");
        }
    }

    @Override
    public void unlock(int key) {
        if (this.key == key) {
            isLocked = false;
        } 
        else {
            System.out.println("Incorrect key! Cannot unlock.");
        }
    }

    @Override
    public boolean locked() {
        return isLocked;
    }


}
