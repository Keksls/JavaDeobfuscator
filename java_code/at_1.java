/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 * Renamed from at
 */
public final class at_1
extends GeneratedMessageV3.Builder<at_1>
implements aj_2 {
    private int a = 0;
    private Object b;
    private SingleFieldBuilderV3<az_1, ab_2, ac_2> c;
    private SingleFieldBuilderV3<ad_1, af_1, ai_1> d;
    private SingleFieldBuilderV3<av_2, ax_1, ay_2> e;

    public static final Descriptors.Descriptor a() {
        return ao_2.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ao_2.b.ensureFieldAccessorsInitialized(ar_2.class, at_1.class);
    }

    at_1() {
        this.x();
    }

    at_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.x();
    }

    private void x() {
        if (ar_2.r()) {
            // empty if block
        }
    }

    public at_1 l() {
        super.clear();
        this.a = 0;
        this.b = null;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ao_2.a;
    }

    public ar_2 m() {
        return ar_2.o();
    }

    public ar_2 n() {
        ar_2 ar_22 = this.o();
        if (!ar_22.isInitialized()) {
            throw at_1.newUninitializedMessageException((Message)ar_22);
        }
        return ar_22;
    }

    public ar_2 o() {
        ar_2 ar_22 = new ar_2(this);
        if (this.a == 1) {
            ar_22.f = this.c == null ? this.b : this.c.build();
        }
        if (this.a == 2) {
            ar_22.f = this.d == null ? this.b : this.d.build();
        }
        if (this.a == 3) {
            ar_22.f = this.e == null ? this.b : this.e.build();
        }
        ar_22.e = this.a;
        this.onBuilt();
        return ar_22;
    }

    public at_1 p() {
        return (at_1)super.clone();
    }

    public at_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (at_1)super.setField(fieldDescriptor, object);
    }

    public at_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (at_1)super.clearField(fieldDescriptor);
    }

    public at_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (at_1)super.clearOneof(oneofDescriptor);
    }

    public at_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (at_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public at_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (at_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public at_1 a(Message message) {
        if (message instanceof ar_2) {
            return this.a((ar_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public at_1 a(ar_2 ar_22) {
        if (ar_22 == ar_2.o()) {
            return this;
        }
        switch (ar_22.b()) {
            case a: {
                this.b(ar_22.d());
                break;
            }
            case b: {
                this.b(ar_22.g());
                break;
            }
            case c: {
                this.b(ar_22.j());
                break;
            }
        }
        this.b(ar_2.b(ar_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public at_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ar_2 ar_22 = null;
        try {
            ar_22 = (ar_2)ar_2.i.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ar_22 = (ar_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ar_22 != null) {
                this.a(ar_22);
            }
        }
        return this;
    }

    @Override
    public au_2 b() {
        return au_2.b(this.a);
    }

    public at_1 q() {
        this.a = 0;
        this.b = null;
        this.onChanged();
        return this;
    }

    @Override
    public boolean c() {
        return this.a == 1;
    }

    @Override
    public az_1 d() {
        if (this.c == null) {
            if (this.a == 1) {
                return (az_1)this.b;
            }
            return az_1.i();
        }
        if (this.a == 1) {
            return (az_1)this.c.getMessage();
        }
        return az_1.i();
    }

    public at_1 a(az_1 az_12) {
        if (this.c == null) {
            if (az_12 == null) {
                throw new NullPointerException();
            }
            this.b = az_12;
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)az_12);
        }
        this.a = 1;
        return this;
    }

    public at_1 a(ab_2 ab_22) {
        if (this.c == null) {
            this.b = ab_22.h();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)ab_22.h());
        }
        this.a = 1;
        return this;
    }

    public at_1 b(az_1 az_12) {
        if (this.c == null) {
            this.b = this.a == 1 && this.b != az_1.i() ? az_1.a((az_1)this.b).a(az_12).i() : az_12;
            this.onChanged();
        } else {
            if (this.a == 1) {
                this.c.mergeFrom((AbstractMessage)az_12);
            }
            this.c.setMessage((AbstractMessage)az_12);
        }
        this.a = 1;
        return this;
    }

    public at_1 r() {
        if (this.c == null) {
            if (this.a == 1) {
                this.a = 0;
                this.b = null;
                this.onChanged();
            }
        } else {
            if (this.a == 1) {
                this.a = 0;
                this.b = null;
            }
            this.c.clear();
        }
        return this;
    }

    public ab_2 s() {
        return (ab_2)this.y().getBuilder();
    }

    @Override
    public ac_2 e() {
        if (this.a == 1 && this.c != null) {
            return (ac_2)this.c.getMessageOrBuilder();
        }
        if (this.a == 1) {
            return (az_1)this.b;
        }
        return az_1.i();
    }

    private SingleFieldBuilderV3<az_1, ab_2, ac_2> y() {
        if (this.c == null) {
            if (this.a != 1) {
                this.b = az_1.i();
            }
            this.c = new SingleFieldBuilderV3((AbstractMessage)((az_1)this.b), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        this.a = 1;
        this.onChanged();
        return this.c;
    }

    @Override
    public boolean f() {
        return this.a == 2;
    }

    @Override
    public ad_1 g() {
        if (this.d == null) {
            if (this.a == 2) {
                return (ad_1)this.b;
            }
            return ad_1.k();
        }
        if (this.a == 2) {
            return (ad_1)this.d.getMessage();
        }
        return ad_1.k();
    }

    public at_1 a(ad_1 ad_12) {
        if (this.d == null) {
            if (ad_12 == null) {
                throw new NullPointerException();
            }
            this.b = ad_12;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)ad_12);
        }
        this.a = 2;
        return this;
    }

    public at_1 a(af_1 af_12) {
        if (this.d == null) {
            this.b = af_12.j();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)af_12.j());
        }
        this.a = 2;
        return this;
    }

    public at_1 b(ad_1 ad_12) {
        if (this.d == null) {
            this.b = this.a == 2 && this.b != ad_1.k() ? ad_1.a((ad_1)this.b).a(ad_12).k() : ad_12;
            this.onChanged();
        } else {
            if (this.a == 2) {
                this.d.mergeFrom((AbstractMessage)ad_12);
            }
            this.d.setMessage((AbstractMessage)ad_12);
        }
        this.a = 2;
        return this;
    }

    public at_1 t() {
        if (this.d == null) {
            if (this.a == 2) {
                this.a = 0;
                this.b = null;
                this.onChanged();
            }
        } else {
            if (this.a == 2) {
                this.a = 0;
                this.b = null;
            }
            this.d.clear();
        }
        return this;
    }

    public af_1 u() {
        return (af_1)this.z().getBuilder();
    }

    @Override
    public ai_1 h() {
        if (this.a == 2 && this.d != null) {
            return (ai_1)this.d.getMessageOrBuilder();
        }
        if (this.a == 2) {
            return (ad_1)this.b;
        }
        return ad_1.k();
    }

    private SingleFieldBuilderV3<ad_1, af_1, ai_1> z() {
        if (this.d == null) {
            if (this.a != 2) {
                this.b = ad_1.k();
            }
            this.d = new SingleFieldBuilderV3((AbstractMessage)((ad_1)this.b), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        this.a = 2;
        this.onChanged();
        return this.d;
    }

    @Override
    public boolean i() {
        return this.a == 3;
    }

    @Override
    public av_2 j() {
        if (this.e == null) {
            if (this.a == 3) {
                return (av_2)this.b;
            }
            return av_2.g();
        }
        if (this.a == 3) {
            return (av_2)this.e.getMessage();
        }
        return av_2.g();
    }

    public at_1 a(av_2 av_22) {
        if (this.e == null) {
            if (av_22 == null) {
                throw new NullPointerException();
            }
            this.b = av_22;
            this.onChanged();
        } else {
            this.e.setMessage((AbstractMessage)av_22);
        }
        this.a = 3;
        return this;
    }

    public at_1 a(ax_1 ax_12) {
        if (this.e == null) {
            this.b = ax_12.f();
            this.onChanged();
        } else {
            this.e.setMessage((AbstractMessage)ax_12.f());
        }
        this.a = 3;
        return this;
    }

    public at_1 b(av_2 av_22) {
        if (this.e == null) {
            this.b = this.a == 3 && this.b != av_2.g() ? av_2.a((av_2)this.b).a(av_22).g() : av_22;
            this.onChanged();
        } else {
            if (this.a == 3) {
                this.e.mergeFrom((AbstractMessage)av_22);
            }
            this.e.setMessage((AbstractMessage)av_22);
        }
        this.a = 3;
        return this;
    }

    public at_1 v() {
        if (this.e == null) {
            if (this.a == 3) {
                this.a = 0;
                this.b = null;
                this.onChanged();
            }
        } else {
            if (this.a == 3) {
                this.a = 0;
                this.b = null;
            }
            this.e.clear();
        }
        return this;
    }

    public ax_1 w() {
        return (ax_1)this.A().getBuilder();
    }

    @Override
    public ay_2 k() {
        if (this.a == 3 && this.e != null) {
            return (ay_2)this.e.getMessageOrBuilder();
        }
        if (this.a == 3) {
            return (av_2)this.b;
        }
        return av_2.g();
    }

    private SingleFieldBuilderV3<av_2, ax_1, ay_2> A() {
        if (this.e == null) {
            if (this.a != 3) {
                this.b = av_2.g();
            }
            this.e = new SingleFieldBuilderV3((AbstractMessage)((av_2)this.b), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        this.a = 3;
        this.onChanged();
        return this.e;
    }

    public final at_1 a(UnknownFieldSet unknownFieldSet) {
        return (at_1)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final at_1 b(UnknownFieldSet unknownFieldSet) {
        return (at_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.l();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.p();
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
        return this.l();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.p();
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
        return this.p();
    }

    public /* synthetic */ Message buildPartial() {
        return this.o();
    }

    public /* synthetic */ Message build() {
        return this.n();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.p();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.o();
    }

    public /* synthetic */ MessageLite build() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.l();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.p();
    }

    public /* synthetic */ Object clone() {
        return this.p();
    }
}

