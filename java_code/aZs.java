/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.debug.NotificationTestCommand;

public class aZs
implements Runnable {
    final /* synthetic */ NotificationTestCommand a;

    public aZs(NotificationTestCommand notificationTestCommand) {
        this.a = notificationTestCommand;
    }

    @Override
    public void run() {
        String string = bae.h().a("notification.skillLevelUpTitle", "Catin");
        String string2 = cIg.createLink(bae.h().a("notification.skillLevelUpText", "Catin", 10), blr_1.b);
        dhc dhc2 = new dhc(string, string2, blr_1.b);
        add_2.b().a(dhc2);
    }
}

