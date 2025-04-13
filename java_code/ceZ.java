/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class ceZ
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(ceZ.class);
    private static final ceZ b = new ceZ();
    private long c;
    private String d;
    private bnh_1 e;
    private cfa_1 f = cfa_1.a;
    private short g;
    private byte h;
    private boolean i;

    public static ceZ a() {
        return b;
    }

    public void a(boolean bl) {
        this.i = bl;
    }

    public void b(long l) {
        this.c = l;
    }

    public void a(String string) {
        this.d = string;
    }

    public void a(cfa_1 cfa_12) {
        this.f = cfa_12;
    }

    public void a(bnh_1 bnh_12) {
        this.e = bnh_12;
    }

    public void a(short s2) {
        this.g = s2;
    }

    public void a(byte by) {
        this.h = by;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 23849: {
                boolean bl = ceX.a((cbf_0)adt_12, this);
                if (!bl) {
                    cuo_0.e().b();
                    azu_0.j().b(this);
                    ceX.a().a(true);
                    azu_0.j().a(ceX.a());
                }
                return false;
            }
            case 23487: {
                cba_0 cba_02 = (cba_0)adt_12;
                a.info((Object)("R\u00e9sultat de la cr\u00e9ation de perso : succes=" + cba_02.b() + ", code=" + cba_02.c()));
                if (cba_02.b()) {
                    cuo_0.e().a(true).a(bae.h().a("loadingWorld.progress", new Object[0]), 0);
                    aND.f().a(() -> cuo_0.e().b());
                } else {
                    cuo_0.e().b();
                    ceZ.b(cba_02.c());
                    cFP.setCreateCharacterFlag(false);
                }
                return false;
            }
        }
        return true;
    }

    public static void b(byte by) {
        String string;
        switch (by) {
            case 102: {
                string = "error.characterCreation.existingName";
                break;
            }
            case 103: {
                string = "error.characterCreation.invalidName";
                break;
            }
            case 104: {
                string = "error.characterCreation.tooManyCharacters";
                break;
            }
            case 106: {
                string = "desc.characterClassDisabled";
                break;
            }
            case 105: {
                string = "error.characterCreation.pendingMigrationRequest";
                break;
            }
            default: {
                string = "error.characterCreation";
            }
        }
        fpm_0.b().a(bae.h().a(string, new Object[0]), cfn_0.a(1), 1027L, 8, 1);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            cwk_0.a().b(this.c);
            cwk_0.a().a(this.d);
            cwk_0.a().a(this.f);
            cwk_0.a().a(this.g);
            cwk_0.a().a(this.h);
            cwk_0.a().a(this.e);
            cwk_0.a().a(this.i);
            azu_0.j().a(cwk_0.a());
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            azu_0.j().b(cwk_0.a());
            this.c = -1L;
            this.d = null;
            this.f = cfa_1.a;
            this.e = null;
        }
    }
}

