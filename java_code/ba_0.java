/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from Ba
 */
public final class ba_0
extends GeneratedMessageV3.Builder<ba_0>
implements bb_0 {
    private int a;
    private long b;
    private int c = 1;
    private long d;
    private le_0 e = null;
    private SingleFieldBuilderV3<le_0, lg, lp> f;
    private Object g = "";

    public static final Descriptors.Descriptor a() {
        return AO.u;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.v.ensureFieldAccessorsInitialized(AY.class, ba_0.class);
    }

    ba_0() {
        this.y();
    }

    ba_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.y();
    }

    private void y() {
        if (AY.t()) {
            this.z();
        }
    }

    public ba_0 n() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 1;
        this.a &= 0xFFFFFFFD;
        this.d = 0L;
        this.a &= 0xFFFFFFFB;
        if (this.f == null) {
            this.e = null;
        } else {
            this.f.clear();
        }
        this.a &= 0xFFFFFFF7;
        this.g = "";
        this.a &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return AO.u;
    }

    public AY o() {
        return AY.q();
    }

    public AY p() {
        AY aY = this.q();
        if (!aY.isInitialized()) {
            throw ba_0.newUninitializedMessageException((Message)aY);
        }
        return aY;
    }

    public AY q() {
        AY aY = new AY(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        aY.i = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        aY.j = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        aY.k = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        aY.l = this.f == null ? this.e : (le_0)this.f.build();
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        aY.m = this.g;
        aY.h = n2;
        this.onBuilt();
        return aY;
    }

    public ba_0 r() {
        return (ba_0)super.clone();
    }

    public ba_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ba_0)super.setField(fieldDescriptor, object);
    }

    public ba_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ba_0)super.clearField(fieldDescriptor);
    }

    public ba_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ba_0)super.clearOneof(oneofDescriptor);
    }

    public ba_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ba_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ba_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ba_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ba_0 a(Message message) {
        if (message instanceof AY) {
            return this.a((AY)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ba_0 a(AY aY) {
        if (aY == AY.q()) {
            return this;
        }
        if (aY.b()) {
            this.a(aY.c());
        }
        if (aY.d()) {
            this.a(aY.e());
        }
        if (aY.f()) {
            this.b(aY.g());
        }
        if (aY.h()) {
            this.b(aY.i());
        }
        if (aY.k()) {
            this.a |= 0x10;
            this.g = aY.m;
            this.onChanged();
        }
        this.b(AY.b(aY));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.d()) {
            return false;
        }
        if (!this.f()) {
            return false;
        }
        return !this.h() || this.i().isInitialized();
    }

    public ba_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        AY aY = null;
        try {
            aY = (AY)AY.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            aY = (AY)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (aY != null) {
                this.a(aY);
            }
        }
        return this;
    }

    @Override
    @Deprecated
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    @Deprecated
    public long c() {
        return this.b;
    }

    @Deprecated
    public ba_0 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    @Deprecated
    public ba_0 s() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public bq_0 e() {
        bq_0 bq_02 = bq_0.a(this.c);
        return bq_02 == null ? bq_0.a : bq_02;
    }

    public ba_0 a(bq_0 bq_02) {
        if (bq_02 == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = bq_02.getNumber();
        this.onChanged();
        return this;
    }

    public ba_0 t() {
        this.a &= 0xFFFFFFFD;
        this.c = 1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean f() {
        return (this.a & 4) == 4;
    }

    @Override
    public long g() {
        return this.d;
    }

    public ba_0 b(long l) {
        this.a |= 4;
        this.d = l;
        this.onChanged();
        return this;
    }

    public ba_0 u() {
        this.a &= 0xFFFFFFFB;
        this.d = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean h() {
        return (this.a & 8) == 8;
    }

    @Override
    public le_0 i() {
        if (this.f == null) {
            return this.e == null ? le_0.H() : this.e;
        }
        return (le_0)this.f.getMessage();
    }

    public ba_0 a(le_0 le_02) {
        if (this.f == null) {
            if (le_02 == null) {
                throw new NullPointerException();
            }
            this.e = le_02;
            this.onChanged();
        } else {
            this.f.setMessage((AbstractMessage)le_02);
        }
        this.a |= 8;
        return this;
    }

    public ba_0 a(lg lg2) {
        if (this.f == null) {
            this.e = lg2.G();
            this.onChanged();
        } else {
            this.f.setMessage((AbstractMessage)lg2.G());
        }
        this.a |= 8;
        return this;
    }

    public ba_0 b(le_0 le_02) {
        if (this.f == null) {
            this.e = (this.a & 8) == 8 && this.e != null && this.e != le_0.H() ? le_0.a(this.e).a(le_02).H() : le_02;
            this.onChanged();
        } else {
            this.f.mergeFrom((AbstractMessage)le_02);
        }
        this.a |= 8;
        return this;
    }

    public ba_0 v() {
        if (this.f == null) {
            this.e = null;
            this.onChanged();
        } else {
            this.f.clear();
        }
        this.a &= 0xFFFFFFF7;
        return this;
    }

    public lg w() {
        this.a |= 8;
        this.onChanged();
        return (lg)this.z().getBuilder();
    }

    @Override
    public lp j() {
        if (this.f != null) {
            return (lp)this.f.getMessageOrBuilder();
        }
        return this.e == null ? le_0.H() : this.e;
    }

    private SingleFieldBuilderV3<le_0, lg, lp> z() {
        if (this.f == null) {
            this.f = new SingleFieldBuilderV3((AbstractMessage)this.i(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.e = null;
        }
        return this.f;
    }

    @Override
    public boolean k() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public String l() {
        Object object = this.g;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.g = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString m() {
        Object object = this.g;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.g = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public ba_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 0x10;
        this.g = string;
        this.onChanged();
        return this;
    }

    public ba_0 x() {
        this.a &= 0xFFFFFFEF;
        this.g = AY.q().l();
        this.onChanged();
        return this;
    }

    public ba_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x10;
        this.g = byteString;
        this.onChanged();
        return this;
    }

    public final ba_0 a(UnknownFieldSet unknownFieldSet) {
        return (ba_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ba_0 b(UnknownFieldSet unknownFieldSet) {
        return (ba_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.n();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.r();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.n();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.r();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.r();
    }

    public /* synthetic */ Message buildPartial() {
        return this.q();
    }

    public /* synthetic */ Message build() {
        return this.p();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.r();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.q();
    }

    public /* synthetic */ MessageLite build() {
        return this.p();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.n();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.r();
    }

    public /* synthetic */ Object clone() {
        return this.r();
    }
}

