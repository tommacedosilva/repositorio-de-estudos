import cardStyles from "./card.module.css";

// JSX === HTML do React

export default function Page() {
    // Logo
    // Card
    // Footer
    return (
        <main>
            <div className={cardStyles.card}>
                <header>
                    <h1>Teste suas habilidades</h1>
                </header>
                <p>
                    Teste os seus conhecimentos sobre o universo Marvel e divirta-se criando o seu AluraQuiz!
                </p>
                <p>
                    Formulário / Botão
                </p>
                <footer>
                    <p>
                        Orgulhosamente criado com o DevSoutinho e a Alura
                    </p>
                </footer>
            </div>
        </main>
    )
}