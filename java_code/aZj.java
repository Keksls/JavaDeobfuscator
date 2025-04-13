/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.debug.FloodChatCommand;
import java.util.ArrayList;

public class aZj
implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ FloodChatCommand b;

    public aZj(FloodChatCommand floodChatCommand, ArrayList arrayList) {
        this.b = floodChatCommand;
        this.a = arrayList;
    }

    @Override
    public void run() {
        String string = (String)this.a.get(Hw.a(this.a.size()));
        aul_0.a().c(string);
    }
}

