/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.debug.FlyingTextCommand;

public class aZl
implements Runnable {
    final /* synthetic */ FlyingTextCommand a;

    public aZl(FlyingTextCommand flyingTextCommand) {
        this.a = flyingTextCommand;
    }

    @Override
    public void run() {
        int n = this.a.f = (this.a.f - 10) % 100;
        zw_0 zw_02 = new zw_0(0, 400, 0, 80, this.a.a(n), 100);
        zu_0 zu_02 = new zu_0(ayq_1.a("lstw", 0, 55), String.valueOf(n), zw_02, 1000);
        zu_02.b(1.0f, 0.0f, 0.0f, 1.0f);
        biI biI2 = azu_0.j().k().bv();
        zu_02.a(biI2);
        zd_0.a().a(zu_02);
    }
}

