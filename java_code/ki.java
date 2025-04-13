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

public final class ki
extends GeneratedMessageV3
implements kl {
    private static final long f = 0L;
    int g;
    public static final int a = 1;
    int h;
    public static final int b = 2;
    boolean i;
    public static final int c = 3;
    List<kR> j;
    public static final int d = 4;
    long k;
    private byte l = (byte)-1;
    private static final ki m = new ki();
    @Deprecated
    public static final Parser<ki> e = new kj();

    ki(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ki() {
        this.h = 0;
        this.i = false;
        this.j = Collections.emptyList();
        this.k = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ki(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 16: {
                        this.g |= 2;
                        this.i = codedInputStream.readBool();
                        continue block13;
                    }
                    case 26: {
                        if ((n & 4) != 4) {
                            this.j = new ArrayList<kR>();
                            n |= 4;
                        }
                        this.j.add((kR)codedInputStream.readMessage(kR.c, extensionRegistryLite));
                        continue block13;
                    }
                    case 32: 
                }
                this.g |= 4;
                this.k = codedInputStream.readInt64();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 4) == 4) {
                this.j = Collections.unmodifiableList(this.j);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return kg.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kg.d.ensureFieldAccessorsInitialized(ki.class, kk.class);
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
    public boolean d() {
        return (this.g & 2) == 2;
    }

    @Override
    public boolean e() {
        return this.i;
    }

    @Override
    public List<kR> f() {
        return this.j;
    }

    @Override
    public List<? extends kU> g() {
        return this.j;
    }

    @Override
    public int h() {
        return this.j.size();
    }

    @Override
    public kR a(int n) {
        return this.j.get(n);
    }

    @Override
    public kU b(int n) {
        return this.j.get(n);
    }

    @Override
    public boolean i() {
        return (this.g & 4) == 4;
    }

    @Override
    public long j() {
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
        if (!this.d()) {
            this.l = 0;
            return false;
        }
        for (int k = 0; k < this.h(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.l = 0;
            return false;
        }
        this.l = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.g & 1) == 1) {
            codedOutputStream.writeInt32(1, this.h);
        }
        if ((this.g & 2) == 2) {
            codedOutputStream.writeBool(2, this.i);
        }
        for (int k = 0; k < this.j.size(); ++k) {
            codedOutputStream.writeMessage(3, (MessageLite)this.j.get(k));
        }
        if ((this.g & 4) == 4) {
            codedOutputStream.writeInt64(4, this.k);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.g & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.h);
        }
        if ((this.g & 2) == 2) {
            n += CodedOutputStream.computeBoolSize((int)2, (boolean)this.i);
        }
        for (int k = 0; k < this.j.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.j.get(k)));
        }
        if ((this.g & 4) == 4) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.k);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ki)) {
            return super.equals(object);
        }
        ki ki2 = (ki)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ki2.b();
        if (this.b()) {
            bl = bl && this.c() == ki2.c();
        }
        boolean bl3 = bl = bl && this.d() == ki2.d();
        if (this.d()) {
            bl = bl && this.e() == ki2.e();
        }
        bl = bl && this.f().equals(ki2.f());
        boolean bl4 = bl = bl && this.i() == ki2.i();
        if (this.i()) {
            bl = bl && this.j() == ki2.j();
        }
        bl = bl && this.unknownFields.equals((Object)ki2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ki.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashBoolean((boolean)this.e());
        }
        if (this.h() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.f().hashCode();
        }
        if (this.i()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.j());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ki a(ByteBuffer byteBuffer) {
        return (ki)e.parseFrom(byteBuffer);
    }

    public static ki a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ki)e.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ki a(ByteString byteString) {
        return (ki)e.parseFrom(byteString);
    }

    public static ki a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ki)e.parseFrom(byteString, extensionRegistryLite);
    }

    public static ki a(byte[] byArray) {
        return (ki)e.parseFrom(byArray);
    }

    public static ki a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ki)e.parseFrom(byArray, extensionRegistryLite);
    }

    public static ki a(InputStream inputStream) {
        return (ki)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream);
    }

    public static ki a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ki)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ki b(InputStream inputStream) {
        return (ki)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream);
    }

    public static ki b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ki)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ki a(CodedInputStream codedInputStream) {
        return (ki)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream);
    }

    public static ki a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ki)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kk k() {
        return ki.l();
    }

    public static kk l() {
        return m.m();
    }

    public static kk a(ki ki2) {
        return m.m().a(ki2);
    }

    public kk m() {
        return this == m ? new kk() : new kk().a(this);
    }

    protected kk a(GeneratedMessageV3.BuilderParent builderParent) {
        kk kk2 = new kk(builderParent);
        return kk2;
    }

    public static ki n() {
        return m;
    }

    public static Parser<ki> o() {
        return e;
    }

    public Parser<ki> getParserForType() {
        return e;
    }

    public ki p() {
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

    static /* synthetic */ UnknownFieldSet b(ki ki2) {
        return ki2.unknownFields;
    }
}

