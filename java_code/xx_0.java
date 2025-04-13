/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Xx
 */
class xx_0
implements ThreadFactory {
    final /* synthetic */ String a;
    final /* synthetic */ xw_0 b;

    xx_0(xw_0 xw_02, String string) {
        this.b = xw_02;
        this.a = string;
    }

    @Override
    public Thread newThread(@NotNull Runnable runnable) {
        return new Thread(runnable, this.a);
    }
}

