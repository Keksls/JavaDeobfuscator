/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.WakfuClient;

public class aNp
implements Runnable {
    final /* synthetic */ ans_0 a;
    final /* synthetic */ WakfuClient b;

    public aNp(WakfuClient wakfuClient, ans_0 ans_02) {
        this.b = wakfuClient;
        this.a = ans_02;
    }

    @Override
    public void run() {
        try {
            this.a.k();
        }
        catch (Throwable throwable) {
            WakfuClient.b.fatal((Object)"Erreur au lancement", throwable);
            System.exit(1);
        }
    }
}

