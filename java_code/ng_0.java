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
 * Renamed from nG
 */
public final class ng_0
extends GeneratedMessageV3
implements nj_0 {
    private static final long j = 0L;
    int k;
    public static final int a = 1;
    long l;
    public static final int b = 2;
    volatile Object m;
    public static final int c = 3;
    volatile Object n;
    public static final int d = 4;
    volatile Object o;
    public static final int e = 5;
    int p;
    public static final int f = 6;
    long q;
    public static final int g = 7;
    List<no_0> r;
    public static final int h = 8;
    List<nk_0> s;
    private byte t = (byte)-1;
    private static final ng_0 u = new ng_0();
    @Deprecated
    public static final Parser<ng_0> i = new nh_0();

    ng_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ng_0() {
        this.l = 0L;
        this.m = "";
        this.n = "";
        this.o = "";
        this.p = 0;
        this.q = 0L;
        this.r = Collections.emptyList();
        this.s = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ng_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block17: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block17;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block17;
                        bl = true;
                        continue block17;
                    }
                    case 8: {
                        this.k |= 1;
                        this.l = codedInputStream.readInt64();
                        continue block17;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.k |= 2;
                        this.m = byteString;
                        continue block17;
                    }
                    case 26: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.k |= 4;
                        this.n = byteString;
                        continue block17;
                    }
                    case 34: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.k |= 8;
                        this.o = byteString;
                        continue block17;
                    }
                    case 40: {
                        this.k |= 0x10;
                        this.p = codedInputStream.readInt32();
                        continue block17;
                    }
                    case 48: {
                        this.k |= 0x20;
                        this.q = codedInputStream.readInt64();
                        continue block17;
                    }
                    case 58: {
                        if ((n & 0x40) != 64) {
                            this.r = new ArrayList<no_0>();
                            n |= 0x40;
                        }
                        this.r.add((no_0)codedInputStream.readMessage(no_0.d, extensionRegistryLite));
                        continue block17;
                    }
                    case 66: 
                }
                if ((n & 0x80) != 128) {
                    this.s = new ArrayList<nk_0>();
                    n |= 0x80;
                }
                this.s.add((nk_0)codedInputStream.readMessage(nk_0.f, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 0x40) == 64) {
                this.r = Collections.unmodifiableList(this.r);
            }
            if ((n & 0x80) == 128) {
                this.s = Collections.unmodifiableList(this.s);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return ne_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ne_0.b.ensureFieldAccessorsInitialized(ng_0.class, ni_0.class);
    }

    @Override
    public boolean b() {
        return (this.k & 1) == 1;
    }

    @Override
    public long c() {
        return this.l;
    }

    @Override
    public boolean d() {
        return (this.k & 2) == 2;
    }

    @Override
    public String e() {
        Object object = this.m;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.m = string;
        }
        return string;
    }

    @Override
    public ByteString f() {
        Object object = this.m;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.m = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean g() {
        return (this.k & 4) == 4;
    }

    @Override
    public String h() {
        Object object = this.n;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.n = string;
        }
        return string;
    }

    @Override
    public ByteString i() {
        Object object = this.n;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.n = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean j() {
        return (this.k & 8) == 8;
    }

    @Override
    public String k() {
        Object object = this.o;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.o = string;
        }
        return string;
    }

    @Override
    public ByteString l() {
        Object object = this.o;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.o = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean m() {
        return (this.k & 0x10) == 16;
    }

    @Override
    public int n() {
        return this.p;
    }

    @Override
    public boolean o() {
        return (this.k & 0x20) == 32;
    }

    @Override
    public long p() {
        return this.q;
    }

    @Override
    public List<no_0> q() {
        return this.r;
    }

    @Override
    public List<? extends nr_0> r() {
        return this.r;
    }

    @Override
    public int s() {
        return this.r.size();
    }

    @Override
    public no_0 a(int n) {
        return this.r.get(n);
    }

    @Override
    public nr_0 b(int n) {
        return this.r.get(n);
    }

    @Override
    public List<nk_0> t() {
        return this.s;
    }

    @Override
    public List<? extends nn_0> u() {
        return this.s;
    }

    @Override
    public int v() {
        return this.s.size();
    }

    @Override
    public nk_0 c(int n) {
        return this.s.get(n);
    }

    @Override
    public nn_0 d(int n) {
        return this.s.get(n);
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.t;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.t = 0;
            return false;
        }
        if (!this.d()) {
            this.t = 0;
            return false;
        }
        if (!this.g()) {
            this.t = 0;
            return false;
        }
        if (!this.j()) {
            this.t = 0;
            return false;
        }
        if (!this.m()) {
            this.t = 0;
            return false;
        }
        if (!this.o()) {
            this.t = 0;
            return false;
        }
        for (n = 0; n < this.s(); ++n) {
            if (this.a(n).isInitialized()) continue;
            this.t = 0;
            return false;
        }
        for (n = 0; n < this.v(); ++n) {
            if (this.c(n).isInitialized()) continue;
            this.t = 0;
            return false;
        }
        this.t = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        if ((this.k & 1) == 1) {
            codedOutputStream.writeInt64(1, this.l);
        }
        if ((this.k & 2) == 2) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.m);
        }
        if ((this.k & 4) == 4) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.n);
        }
        if ((this.k & 8) == 8) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)4, (Object)this.o);
        }
        if ((this.k & 0x10) == 16) {
            codedOutputStream.writeInt32(5, this.p);
        }
        if ((this.k & 0x20) == 32) {
            codedOutputStream.writeInt64(6, this.q);
        }
        for (n = 0; n < this.r.size(); ++n) {
            codedOutputStream.writeMessage(7, (MessageLite)this.r.get(n));
        }
        for (n = 0; n < this.s.size(); ++n) {
            codedOutputStream.writeMessage(8, (MessageLite)this.s.get(n));
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
        if ((this.k & 1) == 1) {
            n2 += CodedOutputStream.computeInt64Size((int)1, (long)this.l);
        }
        if ((this.k & 2) == 2) {
            n2 += GeneratedMessageV3.computeStringSize((int)2, (Object)this.m);
        }
        if ((this.k & 4) == 4) {
            n2 += GeneratedMessageV3.computeStringSize((int)3, (Object)this.n);
        }
        if ((this.k & 8) == 8) {
            n2 += GeneratedMessageV3.computeStringSize((int)4, (Object)this.o);
        }
        if ((this.k & 0x10) == 16) {
            n2 += CodedOutputStream.computeInt32Size((int)5, (int)this.p);
        }
        if ((this.k & 0x20) == 32) {
            n2 += CodedOutputStream.computeInt64Size((int)6, (long)this.q);
        }
        for (n = 0; n < this.r.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)7, (MessageLite)((MessageLite)this.r.get(n)));
        }
        for (n = 0; n < this.s.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)8, (MessageLite)((MessageLite)this.s.get(n)));
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ng_0)) {
            return super.equals(object);
        }
        ng_0 ng_02 = (ng_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ng_02.b();
        if (this.b()) {
            bl = bl && this.c() == ng_02.c();
        }
        boolean bl3 = bl = bl && this.d() == ng_02.d();
        if (this.d()) {
            bl = bl && this.e().equals(ng_02.e());
        }
        boolean bl4 = bl = bl && this.g() == ng_02.g();
        if (this.g()) {
            bl = bl && this.h().equals(ng_02.h());
        }
        boolean bl5 = bl = bl && this.j() == ng_02.j();
        if (this.j()) {
            bl = bl && this.k().equals(ng_02.k());
        }
        boolean bl6 = bl = bl && this.m() == ng_02.m();
        if (this.m()) {
            bl = bl && this.n() == ng_02.n();
        }
        boolean bl7 = bl = bl && this.o() == ng_02.o();
        if (this.o()) {
            bl = bl && this.p() == ng_02.p();
        }
        bl = bl && this.q().equals(ng_02.q());
        bl = bl && this.t().equals(ng_02.t());
        bl = bl && this.unknownFields.equals((Object)ng_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ng_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        if (this.g()) {
            n = 37 * n + 3;
            n = 53 * n + this.h().hashCode();
        }
        if (this.j()) {
            n = 37 * n + 4;
            n = 53 * n + this.k().hashCode();
        }
        if (this.m()) {
            n = 37 * n + 5;
            n = 53 * n + this.n();
        }
        if (this.o()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashLong((long)this.p());
        }
        if (this.s() > 0) {
            n = 37 * n + 7;
            n = 53 * n + this.q().hashCode();
        }
        if (this.v() > 0) {
            n = 37 * n + 8;
            n = 53 * n + this.t().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ng_0 a(ByteBuffer byteBuffer) {
        return (ng_0)i.parseFrom(byteBuffer);
    }

    public static ng_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ng_0)i.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ng_0 a(ByteString byteString) {
        return (ng_0)i.parseFrom(byteString);
    }

    public static ng_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ng_0)i.parseFrom(byteString, extensionRegistryLite);
    }

    public static ng_0 a(byte[] byArray) {
        return (ng_0)i.parseFrom(byArray);
    }

    public static ng_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ng_0)i.parseFrom(byArray, extensionRegistryLite);
    }

    public static ng_0 a(InputStream inputStream) {
        return (ng_0)GeneratedMessageV3.parseWithIOException(i, (InputStream)inputStream);
    }

    public static ng_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ng_0)GeneratedMessageV3.parseWithIOException(i, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ng_0 b(InputStream inputStream) {
        return (ng_0)GeneratedMessageV3.parseDelimitedWithIOException(i, (InputStream)inputStream);
    }

    public static ng_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ng_0)GeneratedMessageV3.parseDelimitedWithIOException(i, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ng_0 a(CodedInputStream codedInputStream) {
        return (ng_0)GeneratedMessageV3.parseWithIOException(i, (CodedInputStream)codedInputStream);
    }

    public static ng_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ng_0)GeneratedMessageV3.parseWithIOException(i, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ni_0 w() {
        return ng_0.x();
    }

    public static ni_0 x() {
        return u.y();
    }

    public static ni_0 a(ng_0 ng_02) {
        return u.y().a(ng_02);
    }

    public ni_0 y() {
        return this == u ? new ni_0() : new ni_0().a(this);
    }

    protected ni_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        ni_0 ni_02 = new ni_0(builderParent);
        return ni_02;
    }

    public static ng_0 z() {
        return u;
    }

    public static Parser<ng_0> A() {
        return i;
    }

    public Parser<ng_0> getParserForType() {
        return i;
    }

    public ng_0 B() {
        return u;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.y();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.w();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.y();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.w();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.B();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.B();
    }

    static /* synthetic */ boolean C() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean D() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean E() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ng_0 ng_02) {
        return ng_02.unknownFields;
    }
}

