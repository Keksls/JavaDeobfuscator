/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.fight.NextSelectedFighterCommand;
import java.util.Comparator;

/*
 * Renamed from aZC
 */
public class azc_0
implements Comparator<blx_1> {
    final /* synthetic */ NextSelectedFighterCommand a;

    public azc_0(NextSelectedFighterCommand nextSelectedFighterCommand) {
        this.a = nextSelectedFighterCommand;
    }

    public int a(blx_1 blx_12, blx_1 blx_13) {
        int n = Short.compare(blx_12.gO(), blx_13.gO());
        if (n != 0) {
            return n;
        }
        return Long.compare(blx_12.a_(), blx_13.a_());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((blx_1)object, (blx_1)object2);
    }
}

