/*
 * Decompiled with CFR 0.152.
 */
import java.util.Timer;
import java.util.TimerTask;

/*
 * Renamed from aIa
 */
public class aia_1 {
    private final Timer a = new Timer();

    public void a(int n, ahz_2 ahz_22) {
        ahy_2 ahy_22 = new ahy_2(ahz_22);
        this.a.schedule((TimerTask)ahy_22, n);
    }
}

