package users;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class User {
    static int id = 0;
    public abstract void update(boolean status);
}