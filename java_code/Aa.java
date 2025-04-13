/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Aa
extends GeneratedMessageV3
implements Ad {
    private static final long f = 0L;
    int g;
    public static final int a = 1;
    int h;
    public static final int b = 2;
    List<Ai> i;
    public static final int c = 3;
    List<Ai> j;
    public static final int d = 4;
    int k;
    private byte l = (byte)-1;
    private static final Aa m = new Aa();
    @Deprecated
    public static final Parser<Aa> e = new Ab();

    Aa(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Aa() {
        this.h = 0;
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
        this.k = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    Aa(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block13;
                        bl = true;
                        continue block13;
                    }
                    case 8: {
                        this.g |= 1;
                        this.h = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 18: {
                        if ((n & 2) != 2) {
                            this.i = new ArrayList<Ai>();
                            n |= 2;
                        }
                        this.i.add((Ai)codedInputStream.readMessage(Ai.e, extensionRegistryLite));
                        continue block13;
                    }
                    case 26: {
                        if ((n & 4) != 4) {
                            this.j = new ArrayList<Ai>();
                            n |= 4;
                        }
                        this.j.add((Ai)codedInputStream.readMessage(Ai.e, extensionRegistryLite));
                        continue block13;
                    }
                    case 32: 
                }
                this.g |= 2;
                this.k = codedInputStream.readInt32();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 2) == 2) {
                this.i = Collections.unmodifiableList(this.i);
            }
            if ((n & 4) == 4) {
                this.j = Collections.unmodifiableList(this.j);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return zy_1.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zy_1.d.ensureFieldAccessorsInitialized(Aa.class, Ac.class);
    }

    @Override
    public boolean b() {
        return (this.g & 1) == 1;
    }

    @Override
    public int c() {
        return this.h;
    }

    @Override
    public List<Ai> d() {
        return this.i;
    }

    @Override
    public List<? extends Al> e() {
        return this.i;
    }

    @Override
    public int f() {
        return this.i.size();
    }

    @Override
    public Ai a(int n) {
        return this.i.get(n);
    }

    @Override
    public Al b(int n) {
        return this.i.get(n);
    }

    @Override
    public List<Ai> g() {
        return this.j;
    }

    @Override
    public List<? extends Al> h() {
        return this.j;
    }

    @Override
    public int i() {
        return this.j.size();
    }

    @Override
    public Ai c(int n) {
        return this.j.get(n);
    }

    @Override
    public Al d(int n) {
        return this.j.get(n);
    }

    @Override
    public boolean j() {
        return (this.g & 2) == 2;
    }

    @Override
    public int k() {
        return this.k;
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.l;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.l = 0;
            return false;
        }
        if (!this.j()) {
            this.l = 0;
            return false;
        }
        for (n = 0; n < this.f(); ++n) {
            if (this.a(n).isInitialized()) continue;
            this.l = 0;
            return false;
        }
        for (n = 0; n < this.i(); ++n) {
            if (this.c(n).isInitialized()) continue;
            this.l = 0;
            return false;
        }
        this.l = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        if ((this.g & 1) == 1) {
            codedOutputStream.writeInt32(1, this.h);
        }
        for (n = 0; n < this.i.size(); ++n) {
            codedOutputStream.writeMessage(2, (MessageLite)this.i.get(n));
        }
        for (n = 0; n < this.j.size(); ++n) {
            codedOutputStream.writeMessage(3, (MessageLite)this.j.get(n));
        }
        if ((this.g & 2) == 2) {
            codedOutputStream.writeInt32(4, this.k);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.g & 1) == 1) {
            n2 += CodedOutputStream.computeInt32Size((int)1, (int)this.h);
        }
        for (n = 0; n < this.i.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.i.get(n)));
        }
        for (n = 0; n < this.j.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.j.get(n)));
        }
        if ((this.g & 2) == 2) {
            n2 += CodedOutputStream.computeInt32Size((int)4, (int)this.k);
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Aa)) {
            return super.equals(object);
        }
        Aa aa = (Aa)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == aa.b();
        if (this.b()) {
            bl = bl && this.c() == aa.c();
        }
        bl = bl && this.d().equals(aa.d());
        bl = bl && this.g().equals(aa.g());
        boolean bl3 = bl = bl && this.j() == aa.j();
        if (this.j()) {
            bl = bl && this.k() == aa.k();
        }
        bl = bl && this.unknownFields.equals((Object)aa.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + Aa.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.f() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.d().hashCode();
        }
        if (this.i() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.g().hashCode();
        }
        if (this.j()) {
            n = 37 * n + 4;
            n = 53 * n + this.k();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static Aa a(ByteBuffer byteBuffer) {
        return (Aa)e.parseFrom(byteBuffer);
    }

    public static Aa a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Aa)e.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Aa a(ByteString byteString) {
        return (Aa)e.parseFrom(byteString);
    }

    public static Aa a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Aa)e.parseFrom(byteString, extensionRegistryLite);
    }

    public static Aa a(byte[] byArray) {
        return (Aa)e.parseFrom(byArray);
    }

    public static Aa a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Aa)e.parseFrom(byArray, extensionRegistryLite);
    }

    public static Aa a(InputStream inputStream) {
        return (Aa)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream);
    }

    public static Aa a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Aa)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Aa b(InputStream inputStream) {
        return (Aa)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream);
    }

    public static Aa b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Aa)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Aa a(CodedInputStream codedInputStream) {
        return (Aa)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream);
    }

    public static Aa a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Aa)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public Ac l() {
        return Aa.m();
    }

    public static Ac m() {
        return m.n();
    }

    public static Ac a(Aa aa) {
        return m.n().a(aa);
    }

    public Ac n() {
        return this == m ? new Ac() : new Ac().a(this);
    }

    protected Ac a(GeneratedMessageV3.BuilderParent builderParent) {
        Ac ac = new Ac(builderParent);
        return ac;
    }

    public static Aa o() {
        return m;
    }

    public static Parser<Aa> p() {
        return e;
    }

    public Parser<Aa> getParserForType() {
        return e;
    }

    public Aa q() {
        return m;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.n();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.l();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.q();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.q();
    }

    static /* synthetic */ boolean r() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean s() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean t() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(Aa aa) {
        return aa.unknownFields;
    }
}

