/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.CmsPollInGame
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.haapi.client.okhttp.ankama.model.CmsPollInGame;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bVN
 */
public class bvn_0
implements ajh_1 {
    public static final String a = "title";
    public static final String b = "description";
    public static final String d = "portrait";
    public static final String[] e = new String[]{"title", "description", "portrait"};
    public static final String f = "npc1719";
    private final CmsPollInGame g;

    public bvn_0(CmsPollInGame cmsPollInGame) {
        this.g = cmsPollInGame;
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.g.getTitle();
        }
        if (b.equals(string)) {
            return this.g.getDescription();
        }
        if (d.equals(string)) {
            return azs_0.a().v(f);
        }
        return null;
    }

    public long a() {
        return this.g.getItemId();
    }

    public String b() {
        return this.g.getUrl();
    }
}

