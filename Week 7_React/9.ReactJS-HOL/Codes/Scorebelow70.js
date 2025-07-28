function Scorebelow70({ players }) {
    const filteredPlayers = players.filter(p => p.score < 70);
    return (
        <div>
            {filteredPlayers.map((item, index) => (
                <li key={index}>
                    Mr. {item.name} <span>{item.score}</span>
                </li>
            ))}
        </div>
    );
}

export default Scorebelow70;
