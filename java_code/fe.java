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

public final class fe
extends GeneratedMessageV3.Builder<fe>
implements fj {
    private int a;
    private List<eV> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<eV, eX, fk> c;
    private boolean d = true;
    private List<eV> e = Collections.emptyList();
    private RepeatedFieldBuilderV3<eV, eX, fk> f;

    public static final Descriptors.Descriptor a() {
        return eT.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eT.b.ensureFieldAccessorsInitialized(fc.class, fe.class);
    }

    fe() {
        this.v();
    }

    fe(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.v();
    }

    private void v() {
        if (fc.p()) {
            this.x();
            this.z();
        }
    }

    public fe j() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        this.d = true;
        this.a &= 0xFFFFFFFD;
        if (this.f == null) {
            this.e = Collections.emptyList();
            this.a &= 0xFFFFFFFB;
        } else {
            this.f.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return eT.a;
    }

    public fc k() {
        return fc.m();
    }

    public fc l() {
        fc fc2 = this.m();
        if (!fc2.isInitialized()) {
            throw fe.newUninitializedMessageException((Message)fc2);
        }
        return fc2;
    }

    public fc m() {
        fc fc2 = new fc(this);
        int n = this.a;
        int n2 = 0;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            fc2.g = this.b;
        } else {
            fc2.g = this.c.build();
        }
        if ((n & 2) == 2) {
            n2 |= 1;
        }
        fc2.h = this.d;
        if (this.f == null) {
            if ((this.a & 4) == 4) {
                this.e = Collections.unmodifiableList(this.e);
                this.a &= 0xFFFFFFFB;
            }
            fc2.i = this.e;
        } else {
            fc2.i = this.f.build();
        }
        fc2.f = n2;
        this.onBuilt();
        return fc2;
    }

    public fe n() {
        return (fe)super.clone();
    }

    public fe a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fe)super.setField(fieldDescriptor, object);
    }

    public fe a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fe)super.clearField(fieldDescriptor);
    }

    public fe a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fe)super.clearOneof(oneofDescriptor);
    }

    public fe a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fe)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fe b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fe)super.addRepeatedField(fieldDescriptor, object);
    }

    public fe a(Message message) {
        if (message instanceof fc) {
            return this.a((fc)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fe a(fc fc2) {
        if (fc2 == fc.m()) {
            return this;
        }
        if (this.c == null) {
            if (!fc2.g.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = fc2.g;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.w();
                    this.b.addAll(fc2.g);
                }
                this.onChanged();
            }
        } else if (!fc2.g.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = fc2.g;
                this.a &= 0xFFFFFFFE;
                this.c = fc.q() ? this.x() : null;
            } else {
                this.c.addAllMessages(fc2.g);
            }
        }
        if (fc2.e()) {
            this.a(fc2.f());
        }
        if (this.f == null) {
            if (!fc2.i.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = fc2.i;
                    this.a &= 0xFFFFFFFB;
                } else {
                    this.y();
                    this.e.addAll(fc2.i);
                }
                this.onChanged();
            }
        } else if (!fc2.i.isEmpty()) {
            if (this.f.isEmpty()) {
                this.f.dispose();
                this.f = null;
                this.e = fc2.i;
                this.a &= 0xFFFFFFFB;
                this.f = fc.r() ? this.z() : null;
            } else {
                this.f.addAllMessages(fc2.i);
            }
        }
        this.b(fc.b(fc2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        for (n = 0; n < this.d(); ++n) {
            if (this.a(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.i(); ++n) {
            if (this.c(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public fe a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        fc fc2 = null;
        try {
            fc2 = (fc)fc.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            fc2 = (fc)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (fc2 != null) {
                this.a(fc2);
            }
        }
        return this;
    }

    private void w() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<eV>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<eV> b() {
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
    public eV a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (eV)this.c.getMessage(n);
    }

    public fe a(int n, eV eV2) {
        if (this.c == null) {
            if (eV2 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.b.set(n, eV2);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)eV2);
        }
        return this;
    }

    public fe a(int n, eX eX2) {
        if (this.c == null) {
            this.w();
            this.b.set(n, eX2.q());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)eX2.q());
        }
        return this;
    }

    public fe a(eV eV2) {
        if (this.c == null) {
            if (eV2 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.b.add(eV2);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)eV2);
        }
        return this;
    }

    public fe b(int n, eV eV2) {
        if (this.c == null) {
            if (eV2 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.b.add(n, eV2);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)eV2);
        }
        return this;
    }

    public fe a(eX eX2) {
        if (this.c == null) {
            this.w();
            this.b.add(eX2.q());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)eX2.q());
        }
        return this;
    }

    public fe b(int n, eX eX2) {
        if (this.c == null) {
            this.w();
            this.b.add(n, eX2.q());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)eX2.q());
        }
        return this;
    }

    public fe a(Iterable<? extends eV> iterable) {
        if (this.c == null) {
            this.w();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public fe o() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public fe e(int n) {
        if (this.c == null) {
            this.w();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public eX f(int n) {
        return (eX)this.x().getBuilder(n);
    }

    @Override
    public fk b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (fk)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends fk> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public eX p() {
        return (eX)this.x().addBuilder((AbstractMessage)eV.r());
    }

    public eX g(int n) {
        return (eX)this.x().addBuilder(n, (AbstractMessage)eV.r());
    }

    public List<eX> q() {
        return this.x().getBuilderList();
    }

    private RepeatedFieldBuilderV3<eV, eX, fk> x() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    @Override
    public boolean e() {
        return (this.a & 2) == 2;
    }

    @Override
    public boolean f() {
        return this.d;
    }

    public fe a(boolean bl) {
        this.a |= 2;
        this.d = bl;
        this.onChanged();
        return this;
    }

    public fe r() {
        this.a &= 0xFFFFFFFD;
        this.d = true;
        this.onChanged();
        return this;
    }

    private void y() {
        if ((this.a & 4) != 4) {
            this.e = new ArrayList<eV>(this.e);
            this.a |= 4;
        }
    }

    @Override
    public List<eV> g() {
        if (this.f == null) {
            return Collections.unmodifiableList(this.e);
        }
        return this.f.getMessageList();
    }

    @Override
    public int i() {
        if (this.f == null) {
            return this.e.size();
        }
        return this.f.getCount();
    }

    @Override
    public eV c(int n) {
        if (this.f == null) {
            return this.e.get(n);
        }
        return (eV)this.f.getMessage(n);
    }

    public fe c(int n, eV eV2) {
        if (this.f == null) {
            if (eV2 == null) {
                throw new NullPointerException();
            }
            this.y();
            this.e.set(n, eV2);
            this.onChanged();
        } else {
            this.f.setMessage(n, (AbstractMessage)eV2);
        }
        return this;
    }

    public fe c(int n, eX eX2) {
        if (this.f == null) {
            this.y();
            this.e.set(n, eX2.q());
            this.onChanged();
        } else {
            this.f.setMessage(n, (AbstractMessage)eX2.q());
        }
        return this;
    }

    public fe b(eV eV2) {
        if (this.f == null) {
            if (eV2 == null) {
                throw new NullPointerException();
            }
            this.y();
            this.e.add(eV2);
            this.onChanged();
        } else {
            this.f.addMessage((AbstractMessage)eV2);
        }
        return this;
    }

    public fe d(int n, eV eV2) {
        if (this.f == null) {
            if (eV2 == null) {
                throw new NullPointerException();
            }
            this.y();
            this.e.add(n, eV2);
            this.onChanged();
        } else {
            this.f.addMessage(n, (AbstractMessage)eV2);
        }
        return this;
    }

    public fe b(eX eX2) {
        if (this.f == null) {
            this.y();
            this.e.add(eX2.q());
            this.onChanged();
        } else {
            this.f.addMessage((AbstractMessage)eX2.q());
        }
        return this;
    }

    public fe d(int n, eX eX2) {
        if (this.f == null) {
            this.y();
            this.e.add(n, eX2.q());
            this.onChanged();
        } else {
            this.f.addMessage(n, (AbstractMessage)eX2.q());
        }
        return this;
    }

    public fe b(Iterable<? extends eV> iterable) {
        if (this.f == null) {
            this.y();
            AbstractMessageLite.Builder.addAll(iterable, this.e);
            this.onChanged();
        } else {
            this.f.addAllMessages(iterable);
        }
        return this;
    }

    public fe s() {
        if (this.f == null) {
            this.e = Collections.emptyList();
            this.a &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.f.clear();
        }
        return this;
    }

    public fe h(int n) {
        if (this.f == null) {
            this.y();
            this.e.remove(n);
            this.onChanged();
        } else {
            this.f.remove(n);
        }
        return this;
    }

    public eX i(int n) {
        return (eX)this.z().getBuilder(n);
    }

    @Override
    public fk d(int n) {
        if (this.f == null) {
            return this.e.get(n);
        }
        return (fk)this.f.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends fk> h() {
        if (this.f != null) {
            return this.f.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.e);
    }

    public eX t() {
        return (eX)this.z().addBuilder((AbstractMessage)eV.r());
    }

    public eX j(int n) {
        return (eX)this.z().addBuilder(n, (AbstractMessage)eV.r());
    }

    public List<eX> u() {
        return this.z().getBuilderList();
    }

    private RepeatedFieldBuilderV3<eV, eX, fk> z() {
        if (this.f == null) {
            this.f = new RepeatedFieldBuilderV3(this.e, (this.a & 4) == 4, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.e = null;
        }
        return this.f;
    }

    public final fe a(UnknownFieldSet unknownFieldSet) {
        return (fe)super.setUnknownFields(unknownFieldSet);
    }

    public final fe b(UnknownFieldSet unknownFieldSet) {
        return (fe)super.mergeUnknownFields(unknownFieldSet);
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
        return this.j();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.n();
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
        return this.j();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.n();
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
        return this.n();
    }

    public /* synthetic */ Message buildPartial() {
        return this.m();
    }

    public /* synthetic */ Message build() {
        return this.l();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.m();
    }

    public /* synthetic */ MessageLite build() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ Object clone() {
        return this.n();
    }
}

