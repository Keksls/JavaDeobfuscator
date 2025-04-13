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

public final class kO
extends GeneratedMessageV3
implements kV {
    private static final long g = 0L;
    int h;
    public static final int a = 1;
    long i;
    public static final int b = 2;
    int j;
    public static final int c = 3;
    int k;
    public static final int d = 5;
    int l;
    public static final int e = 6;
    List<kR> m;
    private byte n = (byte)-1;
    private static final kO o = new kO();
    @Deprecated
    public static final Parser<kO> f = new kP();

    kO(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kO() {
        this.i = 0L;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.h |= 1;
                        this.i = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 16: {
                        this.h |= 2;
                        this.j = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 24: {
                        this.h |= 4;
                        this.k = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 40: {
                        this.h |= 8;
                        this.l = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 50: 
                }
                if ((n & 0x10) != 16) {
                    this.m = new ArrayList<kR>();
                    n |= 0x10;
                }
                this.m.add((kR)codedInputStream.readMessage(kR.c, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 0x10) == 16) {
                this.m = Collections.unmodifiableList(this.m);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return kM.w;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.x.ensureFieldAccessorsInitialized(kO.class, kQ.class);
    }

    @Override
    public boolean b() {
        return (this.h & 1) == 1;
    }

    @Override
    public long c() {
        return this.i;
    }

    @Override
    public boolean d() {
        return (this.h & 2) == 2;
    }

    @Override
    public int e() {
        return this.j;
    }

    @Override
    public boolean f() {
        return (this.h & 4) == 4;
    }

    @Override
    public int g() {
        return this.k;
    }

    @Override
    public boolean h() {
        return (this.h & 8) == 8;
    }

    @Override
    public int i() {
        return this.l;
    }

    @Override
    public List<kR> j() {
        return this.m;
    }

    @Override
    public List<? extends kU> k() {
        return this.m;
    }

    @Override
    public int l() {
        return this.m.size();
    }

    @Override
    public kR a(int n) {
        return this.m.get(n);
    }

    @Override
    public kU b(int n) {
        return this.m.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.n;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.n = 0;
            return false;
        }
        if (!this.d()) {
            this.n = 0;
            return false;
        }
        if (!this.f()) {
            this.n = 0;
            return false;
        }
        if (!this.h()) {
            this.n = 0;
            return false;
        }
        for (int k = 0; k < this.l(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.n = 0;
            return false;
        }
        this.n = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.h & 1) == 1) {
            codedOutputStream.writeInt64(1, this.i);
        }
        if ((this.h & 2) == 2) {
            codedOutputStream.writeInt32(2, this.j);
        }
        if ((this.h & 4) == 4) {
            codedOutputStream.writeInt32(3, this.k);
        }
        if ((this.h & 8) == 8) {
            codedOutputStream.writeInt32(5, this.l);
        }
        for (int k = 0; k < this.m.size(); ++k) {
            codedOutputStream.writeMessage(6, (MessageLite)this.m.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.h & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.i);
        }
        if ((this.h & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.j);
        }
        if ((this.h & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.k);
        }
        if ((this.h & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.l);
        }
        for (int k = 0; k < this.m.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)6, (MessageLite)((MessageLite)this.m.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kO)) {
            return super.equals(object);
        }
        kO kO2 = (kO)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == kO2.b();
        if (this.b()) {
            bl = bl && this.c() == kO2.c();
        }
        boolean bl3 = bl = bl && this.d() == kO2.d();
        if (this.d()) {
            bl = bl && this.e() == kO2.e();
        }
        boolean bl4 = bl = bl && this.f() == kO2.f();
        if (this.f()) {
            bl = bl && this.g() == kO2.g();
        }
        boolean bl5 = bl = bl && this.h() == kO2.h();
        if (this.h()) {
            bl = bl && this.i() == kO2.i();
        }
        bl = bl && this.j().equals(kO2.j());
        bl = bl && this.unknownFields.equals((Object)kO2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kO.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + this.g();
        }
        if (this.h()) {
            n = 37 * n + 5;
            n = 53 * n + this.i();
        }
        if (this.l() > 0) {
            n = 37 * n + 6;
            n = 53 * n + this.j().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kO a(ByteBuffer byteBuffer) {
        return (kO)f.parseFrom(byteBuffer);
    }

    public static kO a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kO)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kO a(ByteString byteString) {
        return (kO)f.parseFrom(byteString);
    }

    public static kO a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kO)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static kO a(byte[] byArray) {
        return (kO)f.parseFrom(byArray);
    }

    public static kO a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kO)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static kO a(InputStream inputStream) {
        return (kO)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static kO a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kO)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kO b(InputStream inputStream) {
        return (kO)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static kO b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kO)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kO a(CodedInputStream codedInputStream) {
        return (kO)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static kO a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kO)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kQ m() {
        return kO.n();
    }

    public static kQ n() {
        return o.o();
    }

    public static kQ a(kO kO2) {
        return o.o().a(kO2);
    }

    public kQ o() {
        return this == o ? new kQ() : new kQ().a(this);
    }

    protected kQ a(GeneratedMessageV3.BuilderParent builderParent) {
        kQ kQ2 = new kQ(builderParent);
        return kQ2;
    }

    public static kO p() {
        return o;
    }

    public static Parser<kO> q() {
        return f;
    }

    public Parser<kO> getParserForType() {
        return f;
    }

    public kO r() {
        return o;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.o();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.o();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.m();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.r();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.r();
    }

    static /* synthetic */ boolean s() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean t() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(kO kO2) {
        return kO2.unknownFields;
    }
}

