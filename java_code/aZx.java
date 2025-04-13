/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.NavigateToCommandSetCommand;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.log4j.Logger;
import org.xml.sax.helpers.DefaultHandler;

public class aZx
extends aZz {
    protected static final Logger a = Logger.getLogger(aZx.class);
    private aZx b;
    private final ArrayList<aZz> c = new ArrayList();

    public aZx() {
        this("", "", false);
    }

    public aZx(String string, String string2, boolean bl) {
        super(string, string2, bl);
    }

    public boolean a(URL uRL) {
        SAXParserFactory sAXParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser sAXParser = sAXParserFactory.newSAXParser();
            aZy aZy2 = new aZy(this);
            sAXParser.parse(uRL.openStream(), (DefaultHandler)aZy2);
            return true;
        }
        catch (Exception exception) {
            a.error((Object)"SAX parser error :", (Throwable)exception);
            return false;
        }
    }

    public void a(ArrayList<aZw> arrayList) {
        for (aZw aZw2 : arrayList) {
            this.e().a(aZw2);
        }
    }

    public boolean a(String string, byte by) {
        for (aZz aZz2 : this.b(string, by)) {
            if (!aZz2.l()) continue;
            return true;
        }
        return false;
    }

    public ArrayList<aZz> b() {
        return this.c;
    }

    public void a(aZz aZz2) {
        this.c.add(aZz2);
    }

    void a(aZx aZx2) {
        this.b = aZx2;
    }

    public aZx c() {
        return this.b;
    }

    public boolean d() {
        return this.b == null;
    }

    public aZx e() {
        if (this.d()) {
            return this;
        }
        return this.c().e();
    }

    public String f() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.b != null) {
            stringBuilder.append(this.c().f());
        }
        return stringBuilder.append(this.h()).append("/").toString();
    }

    public ArrayList<aZz> b(String string, byte by) {
        ArrayList<aZz> arrayList = new ArrayList<aZz>();
        for (aZz aZz2 : this.c) {
            Matcher matcher;
            if (aZz2.i() > by || !(matcher = aZz2.j().matcher(string)).matches()) continue;
            arrayList.add(aZz2);
        }
        return arrayList;
    }

    public ArrayList<String> g() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (aZz aZz2 : this.c) {
            arrayList.add(aZz2.h());
        }
        return arrayList;
    }

    @Override
    public avt_0 a() {
        return new NavigateToCommandSetCommand(this);
    }
}

