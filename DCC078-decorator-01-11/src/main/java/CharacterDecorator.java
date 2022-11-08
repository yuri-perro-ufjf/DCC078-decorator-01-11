public abstract class CharacterDecorator implements Character{
    private Character character;

    public CharacterDecorator(Character character){
        this.character = character;
    }

    public abstract float getDamage();

    @Override
    public float getCharacterDamage() {
        return this.character.getCharacterDamage() + this.getDamage();
    }
}
