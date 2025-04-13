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

/*
 * Renamed from lK
 */
public final class lk_0
extends GeneratedMessageV3
implements lV {
    private static final long g = 0L;
    int h;
    public static final int a = 1;
    List<lR> i;
    public static final int b = 2;
    List<ln_0> j;
    public static final int c = 3;
    int k;
    public static final int d = 4;
    int l;
    public static final int e = 9;
    int m;
    private byte n = (byte)-1;
    private static final lk_0 o = new lk_0();
    @Deprecated
    public static final Parser<lk_0> f = new ll_0();

    lk_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private lk_0() {
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
        this.k = 0;
        this.l = 0;
        this.m = -1;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    lk_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: {
                        if ((n & 1) != 1) {
                            this.i = new ArrayList<lR>();
                            n |= 1;
                        }
                        this.i.add((lR)codedInputStream.readMessage(lR.e, extensionRegistryLite));
                        continue block14;
                    }
                    case 18: {
                        if ((n & 2) != 2) {
                            this.j = new ArrayList<ln_0>();
                            n |= 2;
                        }
                        this.j.add((ln_0)codedInputStream.readMessage(ln_0.c, extensionRegistryLite));
                        continue block14;
                    }
                    case 24: {
                        this.h |= 1;
                        this.k = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 32: {
                        this.h |= 2;
                        this.l = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 72: 
                }
                this.h |= 4;
                this.m = codedInputStream.readInt32();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (n & true) {
                this.i = Collections.unmodifiableList(this.i);
            }
            if ((n & 2) == 2) {
                this.j = Collections.unmodifiableList(this.j);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return kM.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.h.ensureFieldAccessorsInitialized(lk_0.class, lM.class);
    }

    @Override
    public List<lR> b() {
        return this.i;
    }

    @Override
    public List<? extends lU> c() {
        return this.i;
    }

    @Override
    public int d() {
        return this.i.size();
    }

    @Override
    public lR a(int n) {
        return this.i.get(n);
    }

    @Override
    public lU b(int n) {
        return this.i.get(n);
    }

    @Override
    public List<ln_0> e() {
        return this.j;
    }

    @Override
    public List<? extends lQ> f() {
        return this.j;
    }

    @Override
    public int g() {
        return this.j.size();
    }

    @Override
    public ln_0 c(int n) {
        return this.j.get(n);
    }

    @Override
    public lQ d(int n) {
        return this.j.get(n);
    }

    @Override
    public boolean h() {
        return (this.h & 1) == 1;
    }

    @Override
    public int i() {
        return this.k;
    }

    @Override
    public boolean j() {
        return (this.h & 2) == 2;
    }

    @Override
    public int k() {
        return this.l;
    }

    @Override
    public boolean l() {
        return (this.h & 4) == 4;
    }

    @Override
    public int m() {
        return this.m;
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.n;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (n = 0; n < this.d(); ++n) {
            if (this.a(n).isInitialized()) continue;
            this.n = 0;
            return false;
        }
        for (n = 0; n < this.g(); ++n) {
            if (this.c(n).isInitialized()) continue;
            this.n = 0;
            return false;
        }
        this.n = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        for (n = 0; n < this.i.size(); ++n) {
            codedOutputStream.writeMessage(1, (MessageLite)this.i.get(n));
        }
        for (n = 0; n < this.j.size(); ++n) {
            codedOutputStream.writeMessage(2, (MessageLite)this.j.get(n));
        }
        if ((this.h & 1) == 1) {
            codedOutputStream.writeInt32(3, this.k);
        }
        if ((this.h & 2) == 2) {
            codedOutputStream.writeInt32(4, this.l);
        }
        if ((this.h & 4) == 4) {
            codedOutputStream.writeInt32(9, this.m);
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
        for (n = 0; n < this.i.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.i.get(n)));
        }
        for (n = 0; n < this.j.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.j.get(n)));
        }
        if ((this.h & 1) == 1) {
            n2 += CodedOutputStream.computeInt32Size((int)3, (int)this.k);
        }
        if ((this.h & 2) == 2) {
            n2 += CodedOutputStream.computeInt32Size((int)4, (int)this.l);
        }
        if ((this.h & 4) == 4) {
            n2 += CodedOutputStream.computeInt32Size((int)9, (int)this.m);
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof lk_0)) {
            return super.equals(object);
        }
        lk_0 lk_02 = (lk_0)object;
        boolean bl = true;
        bl = bl && this.b().equals(lk_02.b());
        bl = bl && this.e().equals(lk_02.e());
        boolean bl2 = bl = bl && this.h() == lk_02.h();
        if (this.h()) {
            bl = bl && this.i() == lk_02.i();
        }
        boolean bl3 = bl = bl && this.j() == lk_02.j();
        if (this.j()) {
            bl = bl && this.k() == lk_02.k();
        }
        boolean bl4 = bl = bl && this.l() == lk_02.l();
        if (this.l()) {
            bl = bl && this.m() == lk_02.m();
        }
        bl = bl && this.unknownFields.equals((Object)lk_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + lk_0.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        if (this.g() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        if (this.h()) {
            n = 37 * n + 3;
            n = 53 * n + this.i();
        }
        if (this.j()) {
            n = 37 * n + 4;
            n = 53 * n + this.k();
        }
        if (this.l()) {
            n = 37 * n + 9;
            n = 53 * n + this.m();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static lk_0 a(ByteBuffer byteBuffer) {
        return (lk_0)f.parseFrom(byteBuffer);
    }

    public static lk_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (lk_0)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static lk_0 a(ByteString byteString) {
        return (lk_0)f.parseFrom(byteString);
    }

    public static lk_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (lk_0)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static lk_0 a(byte[] byArray) {
        return (lk_0)f.parseFrom(byArray);
    }

    public static lk_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (lk_0)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static lk_0 a(InputStream inputStream) {
        return (lk_0)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static lk_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lk_0)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lk_0 b(InputStream inputStream) {
        return (lk_0)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static lk_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lk_0)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lk_0 a(CodedInputStream codedInputStream) {
        return (lk_0)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static lk_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lk_0)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lM n() {
        return lk_0.o();
    }

    public static lM o() {
        return o.p();
    }

    public static lM a(lk_0 lk_02) {
        return o.p().a(lk_02);
    }

    public lM p() {
        return this == o ? new lM() : new lM().a(this);
    }

    protected lM a(GeneratedMessageV3.BuilderParent builderParent) {
        lM lM2 = new lM(builderParent);
        return lM2;
    }

    public static lk_0 q() {
        return o;
    }

    public static Parser<lk_0> r() {
        return f;
    }

    public Parser<lk_0> getParserForType() {
        return f;
    }

    public lk_0 s() {
        return o;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.p();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.p();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.n();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.s();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.s();
    }

    static /* synthetic */ boolean t() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean u() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean v() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(lk_0 lk_02) {
        return lk_02.unknownFields;
    }
}

