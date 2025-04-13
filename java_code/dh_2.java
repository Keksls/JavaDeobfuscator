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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from dh
 */
public final class dh_2
extends GeneratedMessageV3.Builder<dh_2>
implements di_2 {
    private int a;
    private List<dj_2> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<dj_2, dl_2, dm_2> c;

    public static final Descriptors.Descriptor a() {
        return dd_1.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dd_1.b.ensureFieldAccessorsInitialized(df_1.class, dh_2.class);
    }

    dh_2() {
        this.m();
    }

    dh_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (df_1.k()) {
            this.o();
        }
    }

    public dh_2 e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return dd_1.a;
    }

    public df_1 f() {
        return df_1.h();
    }

    public df_1 g() {
        df_1 df_12 = this.h();
        if (!df_12.isInitialized()) {
            throw dh_2.newUninitializedMessageException((Message)df_12);
        }
        return df_12;
    }

    public df_1 h() {
        df_1 df_12 = new df_1(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            df_12.d = this.b;
        } else {
            df_12.d = this.c.build();
        }
        this.onBuilt();
        return df_12;
    }

    public dh_2 i() {
        return (dh_2)super.clone();
    }

    public dh_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dh_2)super.setField(fieldDescriptor, object);
    }

    public dh_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (dh_2)super.clearField(fieldDescriptor);
    }

    public dh_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (dh_2)super.clearOneof(oneofDescriptor);
    }

    public dh_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (dh_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public dh_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dh_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public dh_2 a(Message message) {
        if (message instanceof df_1) {
            return this.a((df_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public dh_2 a(df_1 df_12) {
        if (df_12 == df_1.h()) {
            return this;
        }
        if (this.c == null) {
            if (!df_12.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = df_12.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(df_12.d);
                }
                this.onChanged();
            }
        } else if (!df_12.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = df_12.d;
                this.a &= 0xFFFFFFFE;
                this.c = df_1.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(df_12.d);
            }
        }
        this.b(df_1.b(df_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public dh_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        df_1 df_12 = null;
        try {
            df_12 = (df_1)df_1.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            df_12 = (df_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (df_12 != null) {
                this.a(df_12);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<dj_2>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<dj_2> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public dj_2 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (dj_2)this.c.getMessage(n);
    }

    public dh_2 a(int n, dj_2 dj_22) {
        if (this.c == null) {
            if (dj_22 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, dj_22);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)dj_22);
        }
        return this;
    }

    public dh_2 a(int n, dl_2 dl_22) {
        if (this.c == null) {
            this.n();
            this.b.set(n, dl_22.h());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)dl_22.h());
        }
        return this;
    }

    public dh_2 a(dj_2 dj_22) {
        if (this.c == null) {
            if (dj_22 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(dj_22);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)dj_22);
        }
        return this;
    }

    public dh_2 b(int n, dj_2 dj_22) {
        if (this.c == null) {
            if (dj_22 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, dj_22);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)dj_22);
        }
        return this;
    }

    public dh_2 a(dl_2 dl_22) {
        if (this.c == null) {
            this.n();
            this.b.add(dl_22.h());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)dl_22.h());
        }
        return this;
    }

    public dh_2 b(int n, dl_2 dl_22) {
        if (this.c == null) {
            this.n();
            this.b.add(n, dl_22.h());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)dl_22.h());
        }
        return this;
    }

    public dh_2 a(Iterable<? extends dj_2> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public dh_2 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public dh_2 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public dl_2 d(int n) {
        return (dl_2)this.o().getBuilder(n);
    }

    @Override
    public dm_2 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (dm_2)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends dm_2> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public dl_2 k() {
        return (dl_2)this.o().addBuilder((AbstractMessage)dj_2.i());
    }

    public dl_2 e(int n) {
        return (dl_2)this.o().addBuilder(n, (AbstractMessage)dj_2.i());
    }

    public List<dl_2> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<dj_2, dl_2, dm_2> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final dh_2 a(UnknownFieldSet unknownFieldSet) {
        return (dh_2)super.setUnknownFields(unknownFieldSet);
    }

    public final dh_2 b(UnknownFieldSet unknownFieldSet) {
        return (dh_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

