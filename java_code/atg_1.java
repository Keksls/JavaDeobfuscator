/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Ordering
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import org.apache.log4j.Logger;

/*
 * Renamed from atG
 */
public class atg_1 {
    private static final Logger f = Logger.getLogger(atg_1.class);
    protected static final Color a = new Color(25, 180, 25);
    protected static final Color b = new Color(180, 25, 25);
    protected static final Color c = new Color(25, 25, 180);
    protected static final Color d = new Color(128, 128, 128);
    private static DefaultMutableTreeNode g;

    public static void a(Anm anm, DefaultMutableTreeNode defaultMutableTreeNode) {
        g = defaultMutableTreeNode;
        defaultMutableTreeNode.add(atg_1.a(anm.b()));
        atg_1.b(anm, defaultMutableTreeNode);
        defaultMutableTreeNode.add(atg_1.a(anm));
        if (anm.b().h()) {
            defaultMutableTreeNode.add(atg_1.c(anm));
        }
        defaultMutableTreeNode.add(atg_1.d(anm));
        defaultMutableTreeNode.add(atg_1.e(anm));
        defaultMutableTreeNode.add(atg_1.f(anm));
        defaultMutableTreeNode.add(atg_1.b(anm));
    }

    private static atl_2 a(Anm anm) {
        String[] stringArray;
        Object object;
        atl_2 atl_22 = new atl_2("Index", b);
        atl_22.add(new atl_2("Scale: " + anm.q().e()));
        atl_22.add(new atl_2("Radius: " + anm.q().f()));
        atl_22.add(new atl_2("UsePerfectHitTest: " + anm.q().l()));
        if (!anm.b().d()) {
            return atl_22;
        }
        FS[] fSArray = anm.q().d();
        if (fSArray != null) {
            object = new atl_2("HiddenParts (" + fSArray.length + ")", Color.GRAY);
            for (int k = 0; k < fSArray.length; ++k) {
                FS fS = fSArray[k];
                ((DefaultMutableTreeNode)object).add(new atl_2("key:" + fS.a + "  hide: " + fS.b));
            }
            atl_22.add((MutableTreeNode)object);
        }
        if ((object = anm.q().q()) != null) {
            atl_2 atl_23 = new atl_2("CanHideParts (" + ((FR[])object).length + ")", Color.GRAY);
            for (int k = 0; k < ((FR[])object).length; ++k) {
                FR fR = object[k];
                atl_23.add(new atl_2("onEquip:" + fR.a + "  hideKey: " + fR.b));
            }
            atl_22.add(atl_23);
        }
        if ((stringArray = anm.q().c()) != null) {
            atl_2 atl_24 = new atl_2("Files (" + stringArray.length + ")", Color.GRAY);
            for (int k = 0; k < stringArray.length; ++k) {
                atl_24.add(new atl_2(k + " " + stringArray[k]));
            }
            atl_22.add(atl_24);
        }
        fo_0[] fo_0Array = anm.q().b();
        atl_2 atl_25 = new atl_2("Animations (" + fo_0Array.length + ")", Color.GRAY);
        for (int k = 0; k < fo_0Array.length; ++k) {
            atl_2 atl_26 = new atl_2("Anim [" + fo_0Array[k].b() + "]");
            atl_26.add(new atl_2("Name: " + fo_0Array[k].b()));
            atl_26.add(new atl_2("Crc: " + fo_0Array[k].c()));
            atl_26.add(new atl_2("fileIndex: " + fo_0Array[k].a()));
            atl_25.add(atl_26);
        }
        atl_22.add(atl_25);
        return atl_22;
    }

    private static void b(Anm anm, DefaultMutableTreeNode defaultMutableTreeNode) {
        atl_2 atl_22 = new atl_2("Links", Color.GRAY);
        defaultMutableTreeNode.add(atl_22);
        List<gc_0> list = anm.c().f().b();
        for (gc_0 gc_02 : list) {
            if (gc_02 == null || gc_02.b() == null) continue;
            atl_2 atl_23 = new atl_2(gc_02.b() + " [sprite: " + gc_02.a() + "]");
            atl_22.add(atl_23);
        }
        atl_22.setUserObject("Links (" + atl_22.getChildCount() + ")");
    }

    private static atl_2 b(Anm anm) {
        Map<Short, fm_0> map = anm.c().g().a();
        int n = map.size();
        atl_2 atl_22 = new atl_2("Imports (" + n + ")", b);
        Object[] objectArray = new Short[n];
        map.keySet().toArray(objectArray);
        Arrays.sort(objectArray);
        for (int k = 0; k < objectArray.length; ++k) {
            fm_0 fm_02 = map.get(objectArray[k]);
            atl_2 atl_23 = new atl_2("Import " + (Short)objectArray[k] + "[" + fm_02.b() + "]", c);
            atl_22.add(atl_23);
            atl_2 atl_24 = new atl_2("id: " + fm_02.a());
            atl_23.add(atl_24);
            atl_24 = new atl_2("name: " + fm_02.b());
            atl_23.add(atl_24);
            atl_24 = new atl_2("crc: " + fm_02.c());
            atl_23.add(atl_24);
        }
        return atl_22;
    }

    private static atl_2 a(fl_0 fl_02) {
        atl_2 atl_22;
        atl_2<fl_0> atl_23 = new atl_2<fl_0>("Header", a, fl_02);
        if (fl_02.j()) {
            atl_22 = new atl_2("optimized");
            atl_23.add(atl_22);
        }
        if (fl_02.c()) {
            atl_22 = new atl_2("use Atlas");
            atl_23.add(atl_22);
        }
        if (fl_02.d()) {
            atl_22 = new atl_2("use localIndex");
            atl_23.add(atl_22);
        }
        if (fl_02.f()) {
            atl_22 = new atl_2("use perfect Hit Test");
            atl_23.add(atl_22);
        }
        if (fl_02.h()) {
            atl_22 = new atl_2("use transform index");
            atl_23.add(atl_22);
        }
        atl_22 = new atl_2("frameRate: " + fl_02.b());
        atl_23.add(atl_22);
        return atl_23;
    }

    private static atl_2 c(Anm anm) {
        assert (anm.p() != null);
        atl_2 atl_22 = new atl_2("Transformations", b);
        atl_22.add(new atl_2("Rotations: " + anm.p().b().length / 4, c));
        atl_22.add(new atl_2("Translation: " + anm.p().c().length / 2, c));
        atl_22.add(new atl_2("Couleurs: " + anm.p().a().length / 4, c));
        atl_22.add(new atl_2("Actions: " + anm.p().d().length, c));
        return atl_22;
    }

    private static atl_2 d(Anm anm) {
        Object object;
        atl_2 atl_22 = new atl_2("Textures (1)", b);
        String string = atg_1.a(anm.o());
        BufferedImage bufferedImage = null;
        try {
            object = azm_2.a(string);
            bufferedImage = azm_2.a((BufferedImage)object, false);
        }
        catch (Exception exception) {
            f.error((Object)exception.getMessage());
        }
        object = new ath_1("Texture ", c, bufferedImage);
        atl_22.add((MutableTreeNode)object);
        atl_2 atl_23 = new atl_2("name: " + string);
        ((DefaultMutableTreeNode)object).add(atl_23);
        return atl_22;
    }

    private static String a(String string) {
        fl_0 fl_02 = (fl_0)atg_1.b((String)"Header").b;
        String string2 = fl_02.c() ? "Atlas/" : "Textures/";
        String string3 = g.getUserObject().toString();
        return gi_0.m(string3) + "/" + string2 + string + ".tga";
    }

    private static atl_2 e(Anm anm) {
        Collection<FU> collection = anm.c().d().a();
        int n = collection.size();
        atl_2 atl_22 = new atl_2("Shapes (" + n + ")", b);
        ImmutableList immutableList = Ordering.natural().onResultOf((Function)new ati_1()).immutableSortedCopy(collection);
        for (FU fU : immutableList) {
            atj_1 atj_12 = new atj_1("Shape " + fU.a(), c, fU);
            atl_22.add(atj_12);
            atg_1.a((atl_2)atj_12, fU);
        }
        return atl_22;
    }

    static BufferedImage a(short s2) {
        atl_2 atl_22 = atg_1.b("Textures");
        if (atl_22 == null) {
            f.error((Object)"noeud Textures inconnu");
            return null;
        }
        TreeNode treeNode = atl_22.getChildAt(s2);
        if (treeNode == null) {
            return null;
        }
        return (BufferedImage)((atl_2)treeNode).b;
    }

    private static atl_2 b(String string) {
        Enumeration<TreeNode> enumeration = g.children();
        while (enumeration.hasMoreElements()) {
            atl_2 atl_22;
            TreeNode treeNode = enumeration.nextElement();
            if (!(treeNode instanceof atl_2) || !(atl_22 = (atl_2)treeNode).getUserObject().toString().startsWith(string)) continue;
            return atl_22;
        }
        return null;
    }

    private static atl_2 f(Anm anm) {
        List<gc_0> list = anm.c().f().b();
        atl_2 atl_22 = new atl_2("Sprites (" + list.size() + ")", b);
        for (gc_0 gc_02 : list) {
            Object object = "";
            if (gc_02 == null) continue;
            if (gc_02.b() != null) {
                object = " [" + gc_02.b() + "]";
            }
            atl_2 atl_23 = null;
            try {
                String string = atg_1.a(gc_02);
                atl_23 = new atl_2("Sprite " + gc_02.a() + " " + (String)object + "(" + string + ")", c);
                atl_22.add(atl_23);
                atl_2 atl_24 = new atl_2("id: " + gc_02.a());
                atl_23.add(atl_24);
                atl_24 = new atl_2("flags: " + (gc_02.e() & 0xFF));
                atl_23.add(atl_24);
                if (gc_02.b() != null) {
                    atl_24 = new atl_2("name: " + gc_02.b());
                    atl_23.add(atl_24);
                    atl_24 = new atl_2("crc: " + gc_02.c());
                    atl_23.add(atl_24);
                    atl_24 = new atl_2("baseNameCRC: " + gc_02.d());
                    atl_23.add(atl_24);
                }
                atg_1.a(atl_23, gc_02);
            }
            catch (Exception exception) {
                if (atl_23 != null) {
                    atl_23.a = d;
                }
                f.error((Object)"", (Throwable)exception);
            }
        }
        return atl_22;
    }

    private static String a(gc_0 gc_02) {
        switch (gc_02.o()) {
            case d: {
                return " index\u00e9";
            }
            case a: {
                return "sprite unique";
            }
            case b: {
                return "sprite sans action";
            }
            case c: {
                return "frame unique";
            }
        }
        return "";
    }

    private static void a(atl_2 cloneable, gc_0 gc_02) {
        Cloneable cloneable2;
        int n = gc_02.i();
        if (n <= 0) {
            return;
        }
        if (n > 1) {
            cloneable2 = new atl_2("Frames (" + n + ")", Color.DARK_GRAY);
            ((DefaultMutableTreeNode)cloneable).add((MutableTreeNode)((Object)cloneable2));
            cloneable = cloneable2;
        }
        cloneable2 = new ArrayList();
        for (int k = 0; k < n; ++k) {
            Object object;
            Object object2;
            atl_2 atl_22;
            atl_2 atl_23;
            int n2 = gc_02.g(k);
            if (n > 1) {
                atl_23 = new atl_2("Frame " + k);
                ((DefaultMutableTreeNode)cloneable).add(atl_23);
            } else {
                atl_23 = cloneable;
            }
            if (n2 > 1) {
                atl_22 = new atl_2("Sprites (" + n2 + ")");
                atl_23.add(atl_22);
            } else {
                atl_22 = atl_23;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                gc_02.t();
                object2 = new Fx();
                object = new Fx();
                short s2 = gc_02.a((Fx)object2, (Fx)object);
                atg_1.a(atl_22, (Fx)object, s2);
            }
            ((ArrayList)cloneable2).clear();
            gc_02.a(k, (ArrayList<Fz>)cloneable2);
            if (((ArrayList)cloneable2).size() <= 0) continue;
            atl_2 atl_24 = new atl_2("Actions (" + ((ArrayList)cloneable2).size() + ")");
            atl_23.add(atl_24);
            object2 = ((ArrayList)cloneable2).iterator();
            while (object2.hasNext()) {
                object = (Fz)object2.next();
                atl_24.add(new atl_2("action: " + ((Fz)object).b().name() + " "));
            }
        }
    }

    private static void a(atl_2 atl_22, Fx fx, int n) {
        atl_2 atl_23 = new atl_2("Sprite " + n, Color.MAGENTA);
        atl_22.add(atl_23);
        atl_2 atl_24 = new atl_2("id: " + n);
        atl_23.add(atl_24);
        if (fx.l() != 1.0f || fx.m() != 1.0f || fx.n() != 1.0f || fx.o() != 1.0f) {
            atl_24 = new atl_2("color: " + fx.l() + "  " + fx.m() + "  " + fx.n() + "  " + fx.o());
            atl_23.add(atl_24);
        }
        atl_24 = new atl_2("matrix:(x) " + fx.d() + "  " + fx.f() + "   " + fx.h());
        atl_23.add(atl_24);
        atl_24 = new atl_2("matrix:(y) " + fx.e() + "  " + fx.g() + "   " + fx.i());
        atl_23.add(atl_24);
    }

    private static void a(atl_2 atl_22, FU fU) {
        atl_2 atl_23 = new atl_2("id: " + fU.a());
        atl_22.add(atl_23);
        atl_23 = new atl_2("textureIndex: " + fU.b());
        atl_22.add(atl_23);
        atl_23 = new atl_2("width: " + fU.g() + "  height: " + fU.h());
        atl_22.add(atl_23);
        atl_23 = new atl_2("offsetX: " + fU.i() + "  offsetY: " + fU.j());
        atl_22.add(atl_23);
        atl_23 = new atl_2("top: " + fU.c() + "  left: " + fU.d() + "  bottom: " + fU.e() + "  right: " + fU.f());
        atl_22.add(atl_23);
    }
}

