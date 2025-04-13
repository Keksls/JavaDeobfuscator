/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aWG
 */
public class awg_0
extends aXj {
    private final int a;
    private final List<String> b;

    public awg_0() {
        this(1);
    }

    public awg_0(int n) {
        this(n, new ArrayList<String>());
    }

    public awg_0(int n, List<String> list) {
        this.a = n;
        this.b = list != null ? list : new ArrayList<String>();
    }

    @Override
    public boolean a() {
        switch (this.a) {
            case 0: 
            case 1: 
            case 2: 
            case 4: 
            case 5: 
            case 7: {
                return this.b.size() == 0;
            }
            case 6: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        try {
            switch (this.a) {
                case 0: {
                    awg_0.d();
                    break;
                }
                case 1: {
                    this.a(aaw_22);
                    break;
                }
                case 6: {
                    this.c(aaw_22);
                    break;
                }
                default: {
                    this.b(aaw_22);
                    break;
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me lors de l'execution d'une commande godmode (client) " + exception);
        }
    }

    public static String c() {
        return null;
    }

    private static void d() {
        awg_0.a("help | h : show full documentation");
        awg_0.a("-all | -a : execute all the options (except exploits)");
        awg_0.a("-fight | -f : character and spells to max level");
        awg_0.a("-exploit | -ex : get all achievements (Don't use this option)");
        awg_0.a("-emotes | -em : unlock emotes");
        awg_0.a("-furniture | -fu : unlock all learnable furniture");
        awg_0.a("-cosmetics | -c : unlock all cosmetics");
        awg_0.a("-cosmetics | -c <typeId|typeName...> : unlock all cosmetics for specific type");
        awg_0.a("");
        awg_0.a("Following cosmetics types are available :");
        for (ft_1 ft_12 : bol_1.a) {
            awg_0.a(String.format("- %s (Id : %s)", ft_12.name(), ft_12.getNumber()));
        }
    }

    private void a(aaw_2 aaw_22) {
        this.b(aaw_22);
        fis_1.a().a((ajf_1)azu_0.j().k(), azu_0.j().k().d());
    }

    private void b(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)437);
        pt.a(this.a);
        aaw_22.c(pt);
    }

    private void c(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)437);
        pt.a(this.a);
        for (String string : this.b) {
            if (string == null) continue;
            pt.a(string);
        }
        aaw_22.c(pt);
    }
}

