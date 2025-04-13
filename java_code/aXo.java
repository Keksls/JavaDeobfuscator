/*
 * Decompiled with CFR 0.152.
 */
public class aXo
extends aXj {
    private final String a;
    private static final int b = 255;

    public aXo(String string) {
        this.a = string;
    }

    @Override
    public boolean a() {
        return this.a != null && !this.a.isEmpty();
    }

    @Override
    public void b() {
        int n2 = Cz.a(this.a).length;
        if (n2 > 255) {
            aVo.a().d("Message exceeds the size limit : 255 characters, special character counts for 2 characters");
            return;
        }
        fzm_0 fzm_02 = fpm_0.b().a("<b>Attention !\n\nVous \u00eates sur le point d'envoyer un message \u00e0 l'ensemble des joueurs connect\u00e9s, \u00eates vous s\u00fbr ?\n\nMessage :</b>\n" + this.a, cfn_0.a(0), 2073L, 102, 1);
        fzm_02.a((n, string) -> {
            if (n == 8) {
                this.c();
            }
        });
    }

    void c() {
        ckj_0 ckj_02 = new ckj_0();
        ckj_02.a(this.a);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("You need to be connected to use this command.");
            return;
        }
        aaw_22.c(ckj_02);
    }
}

