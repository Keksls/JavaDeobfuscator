/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from aVU
 */
public final class avu_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    private final int g;
    private final String[] h;

    public avu_0(int n, String ... stringArray) {
        this.g = n;
        this.h = (String[])stringArray.clone();
    }

    @Override
    public boolean a() {
        switch (this.g) {
            case 0: 
            case 4: {
                return true;
            }
            case 1: 
            case 2: 
            case 3: 
            case 5: {
                return this.h.length == 1;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        try {
            switch (this.g) {
                case 0: {
                    this.c();
                    break;
                }
                case 1: {
                    this.d(aaw_22);
                    break;
                }
                case 2: {
                    this.c(aaw_22);
                    break;
                }
                case 3: {
                    this.b(aaw_22);
                    break;
                }
                case 4: {
                    this.a(aaw_22);
                    break;
                }
                case 5: {
                    this.e(aaw_22);
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me d'une commande" + exception);
        }
    }

    private void a(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)380);
        aaw_22.c(pt);
    }

    private void b(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)299);
        pt.b(Byte.parseByte(this.h[0]));
        aaw_22.c(pt);
    }

    private void c(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)485);
        pt.b(Byte.parseByte(this.h[0]));
        aaw_22.c(pt);
    }

    private void d(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)259);
        pt.b(Byte.parseByte(this.h[0]));
        aaw_22.c(pt);
    }

    private void e(aaw_2 aaw_22) {
        long l = this.h[0] == null ? bhh_1.b() : Long.parseLong(this.h[0]);
        avu_0.a("\n===== Characters of account " + l + " =====");
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)312);
        pt.a(l);
        aaw_22.c(pt);
    }

    private void c() {
        avu_0.a("'character'|'ch' 'help'|'h': Affiche l'aide de la commande");
        avu_0.a("'character'|'ch' 'info': Affiche les infos concernant le personnage");
        avu_0.a("'character'|'ch' 'setSex' sexId : permet de changer le sexe de son personnage");
        avu_0.a("'character'|'ch' 'setVisibility' '0'|'1' : permet de rendre son personnage visible ou invisible");
        avu_0.a("'character'|'ch' 'doNotDisturb'|'dnd' '0'|'1' : permet de passer en mode do not disturb afin de ne plus recevoir de demande d'echange, de combat... Cette modif est valable entre chaque d\u00e9co/reco et n'est annul\u00e9e que par un red\u00e9marrage serveur ou un ch dnd 0");
        avu_0.a("'character'|'ch' 'list' [account id] : list the online characters of the given account (defaults to current account)");
    }

    public String toString() {
        return "CharacterCommand{m_commandId=" + this.g + ", m_args=" + Arrays.toString(this.h) + "}";
    }
}

