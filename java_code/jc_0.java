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

/*
 * Renamed from jc
 */
public final class jc_0
extends GeneratedMessageV3
implements jf_0 {
    private static final long h = 0L;
    int i;
    public static final int a = 1;
    long j;
    public static final int b = 2;
    long k;
    public static final int c = 3;
    int l;
    public static final int d = 4;
    List<iy_0> m;
    public static final int e = 5;
    ja_0 n;
    public static final int f = 6;
    int o;
    private byte p = (byte)-1;
    private static final jc_0 q = new jc_0();
    @Deprecated
    public static final Parser<jc_0> g = new jd_0();

    jc_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jc_0() {
        this.j = 0L;
        this.k = 0L;
        this.l = 0;
        this.m = Collections.emptyList();
        this.o = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jc_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block15: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block15;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block15;
                        bl = true;
                        continue block15;
                    }
                    case 8: {
                        this.i |= 1;
                        this.j = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 16: {
                        this.i |= 2;
                        this.k = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 24: {
                        this.i |= 4;
                        this.l = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 34: {
                        if ((n & 8) != 8) {
                            this.m = new ArrayList<iy_0>();
                            n |= 8;
                        }
                        this.m.add((iy_0)codedInputStream.readMessage(iy_0.e, extensionRegistryLite));
                        continue block15;
                    }
                    case 42: {
                        jC jC2 = null;
                        if ((this.i & 8) == 8) {
                            jC2 = this.n.r();
                        }
                        this.n = (ja_0)codedInputStream.readMessage(ja_0.h, extensionRegistryLite);
                        if (jC2 != null) {
                            jC2.a(this.n);
                            this.n = jC2.s();
                        }
                        this.i |= 8;
                        continue block15;
                    }
                    case 48: 
                }
                this.i |= 0x10;
                this.o = codedInputStream.readInt32();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 8) == 8) {
                this.m = Collections.unmodifiableList(this.m);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return iw_0.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iw_0.h.ensureFieldAccessorsInitialized(jc_0.class, je_0.class);
    }

    @Override
    public boolean b() {
        return (this.i & 1) == 1;
    }

    @Override
    public long c() {
        return this.j;
    }

    @Override
    public boolean d() {
        return (this.i & 2) == 2;
    }

    @Override
    public long e() {
        return this.k;
    }

    @Override
    public boolean f() {
        return (this.i & 4) == 4;
    }

    @Override
    public int g() {
        return this.l;
    }

    @Override
    public List<iy_0> h() {
        return this.m;
    }

    @Override
    public List<? extends jb_0> i() {
        return this.m;
    }

    @Override
    public int j() {
        return this.m.size();
    }

    @Override
    public iy_0 a(int n) {
        return this.m.get(n);
    }

    @Override
    public jb_0 b(int n) {
        return this.m.get(n);
    }

    @Override
    public boolean k() {
        return (this.i & 8) == 8;
    }

    @Override
    public ja_0 l() {
        return this.n == null ? ja_0.s() : this.n;
    }

    @Override
    public jD m() {
        return this.n == null ? ja_0.s() : this.n;
    }

    @Override
    public boolean n() {
        return (this.i & 0x10) == 16;
    }

    @Override
    public int o() {
        return this.o;
    }

    public final boolean isInitialized() {
        byte by = this.p;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.p = 0;
            return false;
        }
        if (!this.f()) {
            this.p = 0;
            return false;
        }
        for (int k = 0; k < this.j(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.p = 0;
            return false;
        }
        this.p = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.i & 1) == 1) {
            codedOutputStream.writeInt64(1, this.j);
        }
        if ((this.i & 2) == 2) {
            codedOutputStream.writeInt64(2, this.k);
        }
        if ((this.i & 4) == 4) {
            codedOutputStream.writeInt32(3, this.l);
        }
        for (int k = 0; k < this.m.size(); ++k) {
            codedOutputStream.writeMessage(4, (MessageLite)this.m.get(k));
        }
        if ((this.i & 8) == 8) {
            codedOutputStream.writeMessage(5, (MessageLite)this.l());
        }
        if ((this.i & 0x10) == 16) {
            codedOutputStream.writeInt32(6, this.o);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.i & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.j);
        }
        if ((this.i & 2) == 2) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.k);
        }
        if ((this.i & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.l);
        }
        for (int k = 0; k < this.m.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((MessageLite)this.m.get(k)));
        }
        if ((this.i & 8) == 8) {
            n += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.l());
        }
        if ((this.i & 0x10) == 16) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.o);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jc_0)) {
            return super.equals(object);
        }
        jc_0 jc_02 = (jc_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == jc_02.b();
        if (this.b()) {
            bl = bl && this.c() == jc_02.c();
        }
        boolean bl3 = bl = bl && this.d() == jc_02.d();
        if (this.d()) {
            bl = bl && this.e() == jc_02.e();
        }
        boolean bl4 = bl = bl && this.f() == jc_02.f();
        if (this.f()) {
            bl = bl && this.g() == jc_02.g();
        }
        bl = bl && this.h().equals(jc_02.h());
        boolean bl5 = bl = bl && this.k() == jc_02.k();
        if (this.k()) {
            bl = bl && this.l().equals(jc_02.l());
        }
        boolean bl6 = bl = bl && this.n() == jc_02.n();
        if (this.n()) {
            bl = bl && this.o() == jc_02.o();
        }
        bl = bl && this.unknownFields.equals((Object)jc_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jc_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.e());
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + this.g();
        }
        if (this.j() > 0) {
            n = 37 * n + 4;
            n = 53 * n + this.h().hashCode();
        }
        if (this.k()) {
            n = 37 * n + 5;
            n = 53 * n + this.l().hashCode();
        }
        if (this.n()) {
            n = 37 * n + 6;
            n = 53 * n + this.o();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jc_0 a(ByteBuffer byteBuffer) {
        return (jc_0)g.parseFrom(byteBuffer);
    }

    public static jc_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jc_0)g.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jc_0 a(ByteString byteString) {
        return (jc_0)g.parseFrom(byteString);
    }

    public static jc_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jc_0)g.parseFrom(byteString, extensionRegistryLite);
    }

    public static jc_0 a(byte[] byArray) {
        return (jc_0)g.parseFrom(byArray);
    }

    public static jc_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jc_0)g.parseFrom(byArray, extensionRegistryLite);
    }

    public static jc_0 a(InputStream inputStream) {
        return (jc_0)GeneratedMessageV3.parseWithIOException(g, (InputStream)inputStream);
    }

    public static jc_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jc_0)GeneratedMessageV3.parseWithIOException(g, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jc_0 b(InputStream inputStream) {
        return (jc_0)GeneratedMessageV3.parseDelimitedWithIOException(g, (InputStream)inputStream);
    }

    public static jc_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jc_0)GeneratedMessageV3.parseDelimitedWithIOException(g, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jc_0 a(CodedInputStream codedInputStream) {
        return (jc_0)GeneratedMessageV3.parseWithIOException(g, (CodedInputStream)codedInputStream);
    }

    public static jc_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jc_0)GeneratedMessageV3.parseWithIOException(g, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public je_0 p() {
        return jc_0.q();
    }

    public static je_0 q() {
        return q.r();
    }

    public static je_0 a(jc_0 jc_02) {
        return q.r().a(jc_02);
    }

    public je_0 r() {
        return this == q ? new je_0() : new je_0().a(this);
    }

    protected je_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        je_0 je_02 = new je_0(builderParent);
        return je_02;
    }

    public static jc_0 s() {
        return q;
    }

    public static Parser<jc_0> t() {
        return g;
    }

    public Parser<jc_0> getParserForType() {
        return g;
    }

    public jc_0 u() {
        return q;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.r();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.p();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.r();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.p();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.u();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.u();
    }

    static /* synthetic */ boolean v() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean w() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jc_0 jc_02) {
        return jc_02.unknownFields;
    }
}

