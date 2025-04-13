/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzv
 */
public class bzv_2
extends bzw_2 {
    public static final String a = "spellInventory";
    public static final String b = "currentSpellDeck";
    public static final String d = "activeSpellsLabel";
    public static final String e = "passiveLabel";
    public static final String f = "naturalStateLabel";
    private static final String[] g = (String[])ArrayUtils.addAll((Object[])bzw_2.q, (Object[])new String[]{"spellInventory", "currentSpellDeck"});
    private static final String h = "spellsInventory";
    @Nullable
    private final bpk_0 i;
    @NotNull
    private bPH j;

    public bzv_2(@NotNull bPH bPH2) {
        this(null, bPH2);
    }

    public bzv_2(@Nullable bmr_1 bmr_12, @NotNull bPH bPH2) {
        this.i = bmr_12 == null ? null : bmr_12.eU();
        this.j = bPH2;
        this.j.c();
    }

    @Override
    protected int a() {
        return 1;
    }

    @Override
    protected String b() {
        return h;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "spellInventory": {
                return this.i;
            }
            case "currentSpellDeck": {
                return this.j;
            }
            case "activeSpellsLabel": {
                return bae.h().a("actives", new Object[0]).toUpperCase();
            }
            case "passiveLabel": {
                return bae.h().a("passiveSpells", new Object[0]).toUpperCase();
            }
            case "naturalStateLabel": {
                return bae.h().a("build.breed.natural.state", new Object[0]).toUpperCase();
            }
        }
        return super.b(string);
    }

    public void a(bPK bPK2) {
        this.j = bPK2;
        this.j.c();
        if (this.i != null) {
            this.i.l();
        }
    }

    @Override
    public String[] d() {
        return g;
    }
}

