function CourseDetails({ courses }) {
  const renderCourses = () => {
    if (courses.length === 0) {
      return <p>No Course Data Available</p>;
    }

    return (
      <>
        {courses.map((c) => (
          <div key={c.id}>
            <h4>{c.cname}</h4>
            <p>Duration: {c.duration}</p>
          </div>
        ))}
      </>
    );
  };

  return (
    <div className="mystyle1">
      <h1>Course Details</h1>
      {renderCourses()}
    </div>
  );
}

export default CourseDetails;
