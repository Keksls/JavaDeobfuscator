/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Optional;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class cWI
implements ahr_1,
fzi {
    private static final Logger h = Logger.getLogger(cWI.class);
    private static final cWI i = new cWI();
    public static final String a = "AnimStatique";
    public static final String b = "AnimEmote-Coucou";
    public static final String c = "AnimEmote-Defaite";
    public static final String d = "AnimEmote-Defaite";
    public static final String e = "AnimStatique";
    public static final String f = "AnimStatique02";
    boolean j;
    private long k;
    private boolean l;
    private boolean m;

    private cWI() {
    }

    public static cWI a() {
        return i;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18869: {
                dfq dfq2 = (dfq)adt_12;
                bnh_1 bnh_12 = dfq2.k();
                this.b(bnh_12);
                return false;
            }
            case 17541: {
                dfq dfq3 = (dfq)adt_12;
                bnh_1 bnh_13 = dfq3.k();
                if (bnh_13 != null) {
                    biI biI2 = bnh_13.bv();
                    biI2.e("AnimEmote-Defaite");
                    fzn_0 fzn_02 = new fzn_0(102, 0, cWI.a(bnh_13.dp()), 65542L);
                    fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
                    fzm_02.a((int n, String string) -> {
                        if (n != 2) {
                            return;
                        }
                        boolean bl = emp_0.b(azu_0.j().n().v(), emq_0.bn);
                        if (bl || string.equalsIgnoreCase(bnh_13.dp())) {
                            cBp cBp2 = new cBp();
                            cBp2.a(bnh_13.a_());
                            azu_0.j().K().c(cBp2);
                        }
                    });
                }
                return false;
            }
            case 17294: {
                boolean bl = azs_0.a().a("characterCreation.tuto.force", false);
                boolean bl2 = azs_0.a().a("dontAskForTuto", false);
                if (bl || bmp_1.a().d() <= 0 && !bl2) {
                    this.a(cfa_1.c, -1L, null, (short)0, null);
                    return false;
                }
                if (bl2) {
                    this.a(cfa_1.a, -1L, null, (short)0, null);
                    return false;
                }
                String string2 = bae.h().a("question.characterCreation.tutorial", new Object[0]);
                fzn_0 fzn_03 = new fzn_0(102, 0, string2, null, cfn_0.a(0), 28L);
                fzm_0 fzm_03 = fpm_0.b().a(fzn_03);
                fzm_03.a((int n, String string) -> {
                    if (n == 8) {
                        this.a(cfa_1.c, -1L, null, (short)0, null);
                    } else if (n == 16) {
                        this.a(cfa_1.a, -1L, null, (short)0, null);
                    }
                });
                return false;
            }
            case 16566: {
                cka_1 cka_12 = new cka_1();
                azu_0.j().K().c(cka_12);
                return false;
            }
            case 19705: {
                dfq dfq4 = (dfq)adt_12;
                this.a((blx_1)dfq4.k());
                return false;
            }
            case 18516: {
                dfq dfq5 = (dfq)adt_12;
                bnh_1 bnh_14 = dfq5.k();
                String string3 = bae.h().a("desc.mail.request", new Object[0]);
                fzn_0 fzn_04 = new fzn_0(102, 0, string3, 65570L);
                ArrayList<String> arrayList = new ArrayList<String>();
                arrayList.add(bae.h().a("skip.mail.request", new Object[0]));
                fzn_04.a(arrayList);
                fzn_04.d(cfn_0.a(0));
                fzm_0 fzm_04 = fpm_0.b().a(fzn_04);
                fzm_04.a((int n, String string) -> {
                    if (n == 2) {
                        if (this.b(string)) {
                            h.info((Object)("[MAIL] Mail send to World : " + string));
                            this.c(string);
                            this.a(bnh_14);
                        } else {
                            cFO.displayMailPopup(bnh_14);
                        }
                    } else {
                        this.a(bnh_14);
                    }
                });
                return false;
            }
            case 17162: {
                this.l = true;
                fis_1.a().a("renameCharacter.locked", true);
                return false;
            }
            case 19843: {
                if (this.m) {
                    return false;
                }
                dfc dfc2 = (dfc)adt_12;
                bnh_1 bnh_15 = (bnh_1)dfc2.j();
                Optional<blx_1> optional = boi_1.b.b(bnh_15);
                if (optional.isEmpty()) {
                    return false;
                }
                cBt cBt2 = new cBt(optional.get().a_(), bnh_15.a_());
                azu_0.j().K().c(cBt2);
                this.m = true;
                return false;
            }
            case 18658: {
                if (this.m) {
                    return false;
                }
                dfc dfc3 = (dfc)adt_12;
                bnh_1 bnh_16 = (bnh_1)dfc3.j();
                Optional<blx_1> optional = boi_1.b.c(bnh_16);
                if (optional.isEmpty()) {
                    return false;
                }
                cBt cBt3 = new cBt(bnh_16.a_(), optional.get().a_());
                azu_0.j().K().c(cBt3);
                this.m = true;
                return false;
            }
        }
        return true;
    }

    @NotNull
    private static String a(String string) {
        if (!boi_1.b.b()) {
            return bae.h().a("question.removeCharacter", string);
        }
        StringBuilder stringBuilder = new StringBuilder(bae.h().a("question.removeCharacter", string));
        stringBuilder.append("\n\n").append(bae.h().a("characterChoice.delete.warning", new Object[0]));
        return stringBuilder.toString();
    }

    private boolean b(String string) {
        return Pattern.matches("\\b[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b", string);
    }

    private void c(String string) {
        cBm cBm2 = new cBm();
        cBm2.a(string);
        azu_0.j().K().c(cBm2);
    }

    private void a(bnh_1 bnh_12) {
        dfq dfq2 = new dfq();
        dfq2.a(bnh_12);
        dfq2.a_(18869);
        add_2.b().a(dfq2);
    }

    private void a(cfa_1 cfa_12, long l, String string, short s2, bnh_1 bnh_12) {
        azu_0.j().b(ceX.a());
        ceZ.a().a(cfa_12);
        ceZ.a().b(l);
        ceZ.a().a(string);
        ceZ.a().a(bnh_12);
        ceZ.a().a(s2);
        ceZ.a().a(true);
        azu_0.j().a(ceZ.a());
    }

    public void a(blx_1 blx_12) {
        blx_1 blx_13 = bmp_1.a().c();
        if (blx_12 != blx_13) {
            this.c(blx_13);
            this.b(blx_12);
        }
        bmp_1.a().e(blx_12);
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bmp_1 bmp_12 = bmp_1.a();
            fis_1.a().a("characterChoice.characterInfosList", boi_1.b);
            fis_1.a().a("characterChoice.selectedCharacter", (Object)null);
            fyb_0 fyb_02 = fpm_0.b().a("characterChoiceDialog", cfi_0.a("characterChoiceDialog"), 8192L, (short)10000);
            fsQ fsQ2 = (fsQ)fyb_02.getElementMap().a("characterList");
            fsQ2.addListContentListener(new cWJ(this, bmp_12, fsQ2));
            cff_0.b().a(this);
            fpm_0.b().a("wakfu.characterChoice", cFO.class);
            cdw_0.n().r();
            this.c();
            ddO.a().a("characterChoiceDialog");
            ddp.a().c();
            this.k = 0L;
            this.l = false;
            fis_1.a().a("renameCharacter.locked", false);
        }
    }

    boolean e() {
        return azs_0.a().a("autoLogin_selectCharacter", false);
    }

    static Optional<blx_1> f() {
        String string = ((bvx_0)ans_0.D().h()).f(bWe.ac);
        if (Cz.f(string)) {
            return Optional.empty();
        }
        return Optional.ofNullable(bmp_1.a().a(string));
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.j = false;
            bmp_1.a().f(null);
            bmp_1.a().e(null);
            fis_1.a().a("characterChoice.characterInfosList");
            fis_1.a().a("renameCharacter.locked");
            cff_0.b().b(this);
            fis_1.a().a("characterChoice.selectedCharacter");
            fpm_0.b().o("characterChoiceDialog");
            fpm_0.b().e("wakfu.characterChoice");
        }
    }

    @Override
    public fzh onDialogCloseRequest(String string) {
        if (cuo_0.e().f()) {
            azu_0.j().H();
            cuo_0.e().b();
        }
        return fzh.a;
    }

    void b(bnh_1 bnh_12) {
        if (bnh_12 != null) {
            cdw_0.n().c(600003L);
            if (bnh_12.ey()) {
                short s2 = bnh_12.eJ();
                if (bnh_12.hK()) {
                    s2 = (short)(s2 | 2);
                }
                this.a(cfa_1.b, bnh_12.a_(), bnh_12.dp(), s2, bnh_12);
            } else {
                cuo_0.e().a(true).a(bae.h().a("loadingWorld.progress", new Object[0]), 0);
                aND.f().a(() -> cuo_0.e().b());
                this.c(bnh_12);
            }
        }
    }

    private void b(blx_1 blx_12) {
        if (blx_12 != null) {
            biI biI2 = blx_12.bv();
            assert (biI2 != null);
            biI2.e(f);
            biI2.g(f);
            fis_1.a().a((ajf_1)blx_12, "actorDescriptorLibrary", "actorAnimation");
        }
    }

    private void c(blx_1 blx_12) {
        if (blx_12 != null) {
            biI biI2 = blx_12.bv();
            assert (biI2 != null);
            biI2.e("AnimStatique");
            biI2.g("AnimStatique");
            fis_1.a().a((ajf_1)blx_12, "actorDescriptorLibrary");
            fis_1.a().a((ajf_1)blx_12, "actorAnimation");
        }
    }

    public void c() {
        blx_1 blx_12 = bmp_1.a().c();
        this.b(blx_12);
        fis_1.a().a("characterChoice.selectedCharacter", blx_12);
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    public boolean d() {
        return this.m;
    }

    public void b(boolean bl) {
        this.m = bl;
    }

    public void a(long l, long l2, String string) {
        if (this.l) {
            return;
        }
        blx_1 blx_12 = bmp_1.a().c();
        if (blx_12 == null || l != blx_12.a_()) {
            bmp_1.a().e(bmp_1.a().b(l));
        }
        this.k = l;
        String string2 = "renameCharacterDialog";
        fpm_0.b().a("renameCharacterDialog", cfi_0.a("renameCharacterDialog"), 256L, (short)10000);
        fis_1.a().a("renameCharacter.dirty", false);
        fis_1.a().a("renameCharater.availableId", l2);
        fis_1.a().a("renameCharater.availableUid", (Object)string);
        boolean bl = emp_0.b(azu_0.j().n().v(), emq_0.ba);
        fis_1.a().a("renameCharater.regex", (Object)(bl ? "[\\p{L} '\\-\\u00b7\\[\\]]+" : "[\\p{L} '\\-]+"), "renameCharacterDialog");
        fis_1.a().a("renameCharater.maxChars", (Object)25, "renameCharacterDialog");
    }

    public void a(cbe_0 cbe_02) {
        this.l = false;
        fis_1.a().a("renameCharacter.locked", false);
        byte by = cbe_02.b();
        if (by != 0) {
            h.error((Object)("Result of character rename : " + by));
            fis_1.a().a("renameCharacter.dirty", false);
            ceZ.b(by);
            return;
        }
        fpm_0.b().o("renameCharacterDialog");
        fis_1.a().a("renameCharacter.dirty");
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(this.k);
        if (bmr_12 != null) {
            bmr_12.c(cbe_02.c());
            fis_1.a().a((ajf_1)bmr_12, "name");
        }
        this.k = 0L;
        if (bmr_12 != null) {
            if (!bmr_12.ey()) {
                this.c(bmr_12);
            } else {
                this.a(cfa_1.b, bmr_12.a_(), bmr_12.dp(), bmr_12.eJ(), bmr_12);
            }
        }
    }

    private void c(bnh_1 bnh_12) {
        cBs cBs2 = new cBs();
        cBs2.a(bnh_12.a_());
        cBs2.a(bnh_12.dp());
        cgu_2.a().a(true);
        azu_0.j().K().c(cBs2);
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.ac, bnh_12.dp());
    }
}

