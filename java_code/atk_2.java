/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from atk
 */
public class atk_2
implements ThreadFactory {
    private int a;

    @Override
    public Thread newThread(@NotNull Runnable runnable) {
        return new Thread(runnable, "AnmLoader #" + this.a++);
    }
}

