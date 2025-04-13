/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;

/*
 * Renamed from aja
 */
public class aja_0 {
    private static final Logger c = Logger.getLogger(aja_0.class);
    private static final String d = ".png";
    public static final String a = "Off";
    private static final String e = "BorderTopLeft";
    private static final String f = "BorderTop";
    private static final String g = "BorderTopRight";
    private static final String h = "BorderRight";
    private static final String i = "BorderBottomRight";
    private static final String j = "BorderBottom";
    private static final String k = "BorderBottomLeft";
    private static final String l = "BorderLeft";
    private static final List<String> m = List.of("BorderTopLeft", "BorderTop", "BorderTopRight", "BorderRight", "BorderBottomRight", "BorderBottom", "BorderBottomLeft", "BorderLeft");
    private static final String n = "BtnCloseDefault";
    private static final String o = "BtnCloseOver";
    private static final String p = "BtnMinimizeDefault";
    private static final String q = "BtnMinimizeOver";
    private static final String r = "BtnMaximizeDefault";
    private static final String s = "BtnMaximizeOver";
    private static final String t = "BtnRestoreDefault";
    private static final String u = "BtnRestoreOver";
    private static final List<String> v = List.of("BtnCloseDefault", "BtnCloseOver", "BtnMinimizeDefault", "BtnMinimizeOver", "BtnMaximizeDefault", "BtnMaximizeOver", "BtnRestoreDefault", "BtnRestoreOver");
    private static final String w = "TitleBarTop2";
    private static final String x = "TitleBarBottom2";
    private static final String y = "TitleBarCenter2";
    private static final List<String> z = List.of("TitleBarTop2", "TitleBarBottom2", "TitleBarCenter2");
    private final String A;
    private final String B;
    public final String b;
    private final ImageIcon C;
    private final Image D;
    private final ImageIcon E;
    private final Image F;
    private final ImageIcon G;
    private final Image H;
    private final ImageIcon I;
    private final Image J;
    private final ImageIcon K;
    private final Image L;
    private final ImageIcon M;
    private final Image N;
    private final ImageIcon O;
    private final Image P;
    private final ImageIcon Q;
    private final Image R;
    private final ImageIcon S;
    private final Image T;
    private final ImageIcon U;
    private final Image V;
    private final ImageIcon W;
    private final Image X;
    private final ImageIcon Y;
    private final ImageIcon Z;
    private final ImageIcon aa;
    private final ImageIcon ab;
    private final ImageIcon ac;
    private final ImageIcon ad;
    private final ImageIcon ae;
    private final ImageIcon af;
    private final Insets ag;

    public static List<String> a() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string : m) {
            arrayList.add(string + d);
            arrayList.add(string + "Off.png");
        }
        for (String string : v) {
            arrayList.add(string + d);
        }
        for (String string : z) {
            arrayList.add(string + d);
        }
        arrayList.sort(String::compareTo);
        return arrayList;
    }

    public aja_0(String string, String string2) {
        this(string, "", null, string2);
    }

    public aja_0(String string, String string2, aja_0 aja_02, String string3) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        this.A = string;
        this.B = string3;
        this.b = string2;
        this.C = this.a(w, aja_02 != null ? aja_02.b() : null);
        this.D = this.C.getImage();
        this.E = this.a(x, aja_02 != null ? aja_02.d() : null);
        this.F = this.E.getImage();
        this.G = this.a(y, aja_02 != null ? aja_02.f() : null);
        this.H = this.G.getImage();
        this.I = this.a(e, aja_02 != null ? aja_02.h() : null);
        this.J = this.I.getImage();
        ImageIcon imageIcon = this.a(f, aja_02 != null ? aja_02.j() : null);
        if (imageIcon.getImageLoadStatus() != 8) {
            BufferedImage bufferedImage = new BufferedImage(1, 18, 1);
            for (n9 = 0; n9 < bufferedImage.getWidth(); ++n9) {
                n8 = bufferedImage.getHeight() - 1;
                bufferedImage.setRGB(n9, 0, 0);
                bufferedImage.setRGB(n9, n8, 0);
                for (n7 = 1; n7 < n8; ++n7) {
                    bufferedImage.setRGB(n9, n7, 255);
                }
            }
            this.K = new ImageIcon(bufferedImage);
        } else {
            this.K = imageIcon;
        }
        this.L = this.K.getImage();
        this.M = this.a(g, aja_02 != null ? aja_02.l() : null);
        this.N = this.M.getImage();
        this.O = this.a(l, aja_02 != null ? aja_02.n() : null);
        this.P = this.O.getImage();
        this.Q = this.a(k, aja_02 != null ? aja_02.p() : null);
        this.R = this.Q.getImage();
        this.S = this.a(j, aja_02 != null ? aja_02.r() : null);
        this.T = this.S.getImage();
        this.U = this.a(i, aja_02 != null ? aja_02.t() : null);
        this.V = this.U.getImage();
        this.W = this.a(h, aja_02 != null ? aja_02.v() : null);
        this.X = this.W.getImage();
        this.Y = this.a(n, aja_02 != null ? aja_02.x() : null);
        this.Z = this.a(o, aja_02 != null ? aja_02.y() : null);
        this.aa = this.a(p, aja_02 != null ? aja_02.z() : null);
        this.ab = this.a(q, aja_02 != null ? aja_02.A() : null);
        this.ac = this.a(r, aja_02 != null ? aja_02.B() : null);
        this.ad = this.a(s, aja_02 != null ? aja_02.C() : null);
        this.ae = this.a(t, aja_02 != null ? aja_02.D() : null);
        this.af = this.a(u, aja_02 != null ? aja_02.E() : null);
        int n10 = this.J.getHeight(null);
        n9 = this.N.getHeight(null);
        n8 = this.L.getHeight(null);
        n7 = Math.max(Math.max(n10, n9), n8);
        if (n10 != n7) {
            c.warn((Object)("Skin pbm : top left image height not consistent : " + n10 + " != " + n7));
        }
        if (n9 != n7) {
            c.warn((Object)("Skin pbm : top right image height not consistent : " + n9 + " != " + n7));
        }
        if (n8 != n7) {
            c.warn((Object)("Skin pbm : top image height not consistent : " + n8 + " != " + n7));
        }
        if ((n6 = this.P.getWidth(null)) != (n5 = Math.max(n6, n4 = this.R.getWidth(null)))) {
            c.warn((Object)("Skin pbm : left image width not consistent : " + n6 + " != " + n5));
        }
        if (n4 != n5) {
            c.warn((Object)("Skin pbm : bottom left image width not consistent : " + n4 + " != " + n5));
        }
        int n11 = this.R.getHeight(null);
        int n12 = this.T.getHeight(null);
        int n13 = this.V.getHeight(null);
        int n14 = Math.max(Math.max(n11, n12), n13);
        if (n11 != n14) {
            c.warn((Object)("Skin pbm : bottom left image height not consistent : " + n11 + " != " + n14));
        }
        if (n12 != n14) {
            c.warn((Object)("Skin pbm : bottom image height not consistent : " + n12 + " != " + n14));
        }
        if (n13 != n14) {
            c.warn((Object)("Skin pbm : bottom right image height not consistent : " + n13 + " != " + n14));
        }
        if ((n3 = this.X.getWidth(null)) != (n2 = Math.max(n3, n = this.V.getWidth(null)))) {
            c.warn((Object)("Skin pbm : right image width not consistent : " + n3 + " != " + n2));
        }
        if (n != n2) {
            c.warn((Object)("Skin pbm : bottom right image width not consistent : " + n + " != " + n2));
        }
        this.ag = new Insets(n7, n5, n14, n2);
    }

    private ImageIcon a(String string, ImageIcon imageIcon) {
        ImageIcon imageIcon2;
        URL uRL;
        if (!Cz.f(this.B)) {
            try {
                uRL = gg_0.d(this.B + string + this.b + d);
                imageIcon2 = new ImageIcon(uRL);
            }
            catch (MalformedURLException malformedURLException) {
                imageIcon2 = new ImageIcon(this.B + string + this.b + d);
            }
            if (imageIcon2.getImageLoadStatus() == 8) {
                return imageIcon2;
            }
        }
        try {
            uRL = gg_0.d(this.A + string + this.b + d);
            imageIcon2 = new ImageIcon(uRL);
        }
        catch (MalformedURLException malformedURLException) {
            imageIcon2 = new ImageIcon(this.A + string + this.b + d);
        }
        if (imageIcon2.getImageLoadStatus() != 8) {
            if (imageIcon != null) {
                imageIcon2 = imageIcon;
            } else {
                c.error((Object)("Skin image not present : " + this.A + string));
            }
        }
        return imageIcon2;
    }

    public ImageIcon b() {
        return this.C;
    }

    public Image c() {
        return this.D;
    }

    public ImageIcon d() {
        return this.E;
    }

    public Image e() {
        return this.F;
    }

    public ImageIcon f() {
        return this.G;
    }

    public Image g() {
        return this.H;
    }

    public ImageIcon h() {
        return this.I;
    }

    public Image i() {
        return this.J;
    }

    public ImageIcon j() {
        return this.K;
    }

    public Image k() {
        return this.L;
    }

    public ImageIcon l() {
        return this.M;
    }

    public Image m() {
        return this.N;
    }

    public ImageIcon n() {
        return this.O;
    }

    public Image o() {
        return this.P;
    }

    public ImageIcon p() {
        return this.Q;
    }

    public Image q() {
        return this.R;
    }

    public ImageIcon r() {
        return this.S;
    }

    public Image s() {
        return this.T;
    }

    public ImageIcon t() {
        return this.U;
    }

    public Image u() {
        return this.V;
    }

    public ImageIcon v() {
        return this.W;
    }

    public Image w() {
        return this.X;
    }

    public ImageIcon x() {
        return this.Y;
    }

    public ImageIcon y() {
        return this.Z;
    }

    public ImageIcon z() {
        return this.aa;
    }

    public ImageIcon A() {
        return this.ab;
    }

    public ImageIcon B() {
        return this.ac;
    }

    public ImageIcon C() {
        return this.ad;
    }

    public ImageIcon D() {
        return this.ae;
    }

    public ImageIcon E() {
        return this.af;
    }

    public Insets F() {
        return this.ag;
    }
}

