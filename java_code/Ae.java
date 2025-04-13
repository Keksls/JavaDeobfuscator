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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
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

public final class Ae
extends GeneratedMessageV3
implements Ah {
    private static final long f = 0L;
    int g;
    public static final int a = 1;
    int h;
    public static final int b = 2;
    List<Aa> i;
    public static final int c = 3;
    List<Integer> j;
    public static final int d = 4;
    boolean k;
    private byte l = (byte)-1;
    private static final Ae m = new Ae();
    @Deprecated
    public static final Parser<Ae> e = new Af();

    Ae(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Ae() {
        this.h = 0;
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
        this.k = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    Ae(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block14: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block14;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block14;
                        bl = true;
                        continue block14;
                    }
                    case 8: {
                        this.g |= 1;
                        this.h = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 18: {
                        if ((n & 2) != 2) {
                            this.i = new ArrayList<Aa>();
                            n |= 2;
                        }
                        this.i.add((Aa)codedInputStream.readMessage(Aa.e, extensionRegistryLite));
                        continue block14;
                    }
                    case 24: {
                        if ((n & 4) != 4) {
                            this.j = new ArrayList<Integer>();
                            n |= 4;
                        }
                        this.j.add(codedInputStream.readInt32());
                        continue block14;
                    }
                    case 26: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 4) != 4 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.j = new ArrayList<Integer>();
                            n |= 4;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.j.add(codedInputStream.readInt32());
                        }
                        codedInputStream.popLimit(n4);
                        continue block14;
                    }
                    case 32: 
                }
                this.g |= 2;
                this.k = codedInputStream.readBool();
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
        return zy_1.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zy_1.b.ensureFieldAccessorsInitialized(Ae.class, Ag.class);
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
    public List<Aa> d() {
        return this.i;
    }

    @Override
    public List<? extends Ad> e() {
        return this.i;
    }

    @Override
    public int f() {
        return this.i.size();
    }

    @Override
    public Aa a(int n) {
        return this.i.get(n);
    }

    @Override
    public Ad b(int n) {
        return this.i.get(n);
    }

    @Override
    public List<Integer> g() {
        return this.j;
    }

    @Override
    public int h() {
        return this.j.size();
    }

    @Override
    public int c(int n) {
        return this.j.get(n);
    }

    @Override
    public boolean i() {
        return (this.g & 2) == 2;
    }

    @Override
    public boolean j() {
        return this.k;
    }

    public final boolean isInitialized() {
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
        if (!this.i()) {
            this.l = 0;
            return false;
        }
        for (int k = 0; k < this.f(); ++k) {
            if (this.a(k).isInitialized()) continue;
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
            codedOutputStream.writeInt32(3, this.j.get(n).intValue());
        }
        if ((this.g & 2) == 2) {
            codedOutputStream.writeBool(4, this.k);
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
        n = 0;
        for (int k = 0; k < this.j.size(); ++k) {
            n += CodedOutputStream.computeInt32SizeNoTag((int)this.j.get(k));
        }
        n2 += n;
        n2 += 1 * this.g().size();
        if ((this.g & 2) == 2) {
            n2 += CodedOutputStream.computeBoolSize((int)4, (boolean)this.k);
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Ae)) {
            return super.equals(object);
        }
        Ae ae = (Ae)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ae.b();
        if (this.b()) {
            bl = bl && this.c() == ae.c();
        }
        bl = bl && this.d().equals(ae.d());
        bl = bl && this.g().equals(ae.g());
        boolean bl3 = bl = bl && this.i() == ae.i();
        if (this.i()) {
            bl = bl && this.j() == ae.j();
        }
        bl = bl && this.unknownFields.equals((Object)ae.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + Ae.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.f() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.d().hashCode();
        }
        if (this.h() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.g().hashCode();
        }
        if (this.i()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.j());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static Ae a(ByteBuffer byteBuffer) {
        return (Ae)e.parseFrom(byteBuffer);
    }

    public static Ae a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Ae)e.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Ae a(ByteString byteString) {
        return (Ae)e.parseFrom(byteString);
    }

    public static Ae a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Ae)e.parseFrom(byteString, extensionRegistryLite);
    }

    public static Ae a(byte[] byArray) {
        return (Ae)e.parseFrom(byArray);
    }

    public static Ae a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Ae)e.parseFrom(byArray, extensionRegistryLite);
    }

    public static Ae a(InputStream inputStream) {
        return (Ae)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream);
    }

    public static Ae a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Ae)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Ae b(InputStream inputStream) {
        return (Ae)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream);
    }

    public static Ae b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Ae)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Ae a(CodedInputStream codedInputStream) {
        return (Ae)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream);
    }

    public static Ae a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Ae)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public Ag k() {
        return Ae.l();
    }

    public static Ag l() {
        return m.m();
    }

    public static Ag a(Ae ae) {
        return m.m().a(ae);
    }

    public Ag m() {
        return this == m ? new Ag() : new Ag().a(this);
    }

    protected Ag a(GeneratedMessageV3.BuilderParent builderParent) {
        Ag ag = new Ag(builderParent);
        return ag;
    }

    public static Ae n() {
        return m;
    }

    public static Parser<Ae> o() {
        return e;
    }

    public Parser<Ae> getParserForType() {
        return e;
    }

    public Ae p() {
        return m;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.m();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.k();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.p();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.p();
    }

    static /* synthetic */ boolean q() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean r() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(Ae ae) {
        return ae.unknownFields;
    }
}

